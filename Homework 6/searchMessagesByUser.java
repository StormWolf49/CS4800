import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("rawtypes")
public class searchMessagesByUser implements Iterator {
    private ChatHistory chatHistory;
    private String userToSearch;

    private int index;

    public searchMessagesByUser(ChatHistory chatHistory, String userToSearch) {
        this.chatHistory = chatHistory;
        this.userToSearch = userToSearch;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while (index < chatHistory.size()) {
            Message message = chatHistory.getMessage(index);
            if (message.getSender().equals(userToSearch) || message.getRecipients().contains(userToSearch)) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Message next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Message message = chatHistory.getMessage(index);
        index++;
        return message;
    }
}
