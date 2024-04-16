import java.util.*;

class ChatServer {
    private Map<User, List<User>> blockedUsers;

    public ChatServer() {
        this.blockedUsers = new HashMap<>();
    }

    public void addUser(User user) {
        blockedUsers.put(user, new ArrayList<>());
    }

    public void sendMessage(Message message) {
        List<String> recipients = message.getRecipients();
        for (String recipient : recipients) {
            if (!isUserBlocked(getUserByName(recipient), message.getSender())) {
                User user = getUserByName(recipient);
                if (user != null) {
                    user.receiveMessage(message);
                }
            }
        }
    }

    public void blockUser(User blocker, User blockee) {
        blockedUsers.computeIfAbsent(blocker, k -> new ArrayList<>()).add(blockee);
    }

    public void unblockUser(User blocker, User blockee) {
        blockedUsers.computeIfAbsent(blocker, k -> new ArrayList<>()).remove(blockee);
    }

    private boolean isUserBlocked(User blocker, String blockeeName) {
        List<User> blockedList = blockedUsers.get(blocker);
        return blockedList != null && blockedList.stream().anyMatch(user -> user.getName().equals(blockeeName));
    }

    private User getUserByName(String name) {
        for (User user : blockedUsers.keySet()) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}