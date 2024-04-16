import java.util.*;

class ChatHistory implements IterableByUser {
    private ArrayList<Message> messages;
    private User user;

    public ChatHistory(User user) {
        this.messages = new ArrayList<>();
        this.user = user;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void removeLastSentMessage(MessageMemento memento) {
        for(int i = 0; i < messages.size(); i++) {
            if(messages.get(i).getContent().equals(memento.getContent()) && messages.get(i).getTimestamp().equals(memento.getTimestamp())) {
                messages.remove(i);
                break;
            }
        }        
    }

    public Message removeLastMessage() {
        return messages.get(messages.size() - 1);
    }

    public void printChatHistory() {
        System.out.println(user.getName() + "'s Chat History:");
        for (Message message : messages) {
            System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + " -> " + message.getRecipients() + ": " + message.getContent());
        }
    }

    public int size() {
        return messages.size();
    }

    public Message getMessage(int index) {
        return messages.get(index);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Iterator iterator(User userToSearchWith) {
        return userToSearchWith.iterator(userToSearchWith);
    }
}