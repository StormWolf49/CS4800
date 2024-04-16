import java.util.Arrays;
import java.util.Iterator;

public class H6_Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        User alice = new User("Alice", chatServer);
        User bob = new User("Bob", chatServer);
        User charlie = new User("Charlie", chatServer);

        chatServer.sendMessage(new Message("System", Arrays.asList(alice.getName(), bob.getName(), charlie.getName()), "Welcome to the chat!"));

        alice.sendMessage(Arrays.asList(bob, charlie), "Hello Bob and Charlie!");
        bob.blockUser(alice);
        alice.sendMessage(Arrays.asList(bob, charlie), "I think you blocked me Bob!");
        alice.sendMessage(Arrays.asList(bob, charlie), "Are you getting this Charlie?");
        charlie.sendMessage(Arrays.asList(bob, alice), "Hello Bob and Alice!");

        alice.undoLastMessage();
        bob.sendMessage(Arrays.asList(alice), "Hi Alice, unblocked you!");
        charlie.sendMessage(Arrays.asList(alice), "Alice, can you see my messages?");

        // Iterate over Alice's message history with Bob
        System.out.println("Alice's messages with Bob:");
        for (Iterator<Message> iterator = alice.iterator(bob); iterator.hasNext(); ) {
            Message message = iterator.next();
            System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + " -> " + message.getRecipients() + ": " + message.getContent());
        }

        // Iterate over Alice's message history with Charlie
        System.out.println("\nAlice's messages with Charlie:");
        for (Iterator<Message> iterator = alice.iterator(charlie); iterator.hasNext(); ) {
            Message message = iterator.next();
            System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + " -> " + message.getRecipients() + ": " + message.getContent());
        }

        // Iterate over Alice's message history with Bob
        System.out.println("\nBob's messages with Alice:");
        for (Iterator<Message> iterator = bob.iterator(alice); iterator.hasNext(); ) {
            Message message = iterator.next();
            System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + " -> " + message.getRecipients() + ": " + message.getContent());
        }
    }
}