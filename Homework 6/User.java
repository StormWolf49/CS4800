import java.util.*;
import java.util.stream.Collectors;

class User implements IterableByUser {
    private String name;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private Stack<MessageMemento> messageMementos;

    public User(String name, ChatServer chatServer) {
        this.name = name;
        this.chatServer = chatServer;
        this.chatHistory = new ChatHistory(this);
        this.messageMementos = new Stack<>();
        this.chatServer.addUser(this);
    }

    public String getName() {
        return name;
    }

    public void sendMessage(List<User> recipients, String content) {
        Message message = new Message(name, recipients.stream().map(User::getName).collect(Collectors.toList()), content);
        chatServer.sendMessage(message);
        chatHistory.addMessage(message);
        messageMementos.add(new MessageMemento(message.getContent(), message.getTimestamp()));
    }

    public void receiveMessage(Message message) {
        System.out.println("[" + name + " received message from " + message.getSender() + "]: " + message.getContent());
        chatHistory.addMessage(message);
    }

    public void undoLastMessage() {
        if (!messageMementos.isEmpty()) {
            MessageMemento memento = messageMementos.pop();
            chatHistory.removeLastSentMessage(memento);
            System.out.println("[Undo " + name + "'s last message]");
        } else {
            System.out.println("[None of " + name + "'s messages to undo]");
        }
    }

    public void blockUser(User user) {
        chatServer.blockUser(this, user);
    }

    public void unblockUser(User user) {
        chatServer.unblockUser(this, user);
    }

    public ChatHistory getChatHistory() {
        return chatHistory;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Iterator iterator(User userToSearchWith) {
        return new searchMessagesByUser(getChatHistory(), userToSearchWith.getName());
    }
}