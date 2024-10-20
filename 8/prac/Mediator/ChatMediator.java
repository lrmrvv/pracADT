import java.util.*;

public class ChatMediator implements IMediator {
    private Map<String, List<IUser>> channels;

    public ChatMediator() {
        this.channels = new HashMap<>();
    }

    @Override
    public void sendMessage(String message, IUser user, String channelName) {
        if (!channels.containsKey(channelName)) {
            System.out.println("Channel " + channelName + " does not exist!");
            return;
        }
        List<IUser> usersInChannel = channels.get(channelName);
        for (IUser u : usersInChannel) {
            if (u != user) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(IUser user, String channelName) {
        channels.putIfAbsent(channelName, new ArrayList<>());
        channels.get(channelName).add(user);
        notifyAllUsers(user.getName() + " has joined the channel " + channelName, channelName);
    }

    @Override
    public void removeUser(IUser user, String channelName) {
        if (channels.containsKey(channelName)) {
            channels.get(channelName).remove(user);
            notifyAllUsers(user.getName() + " has left the channel " + channelName, channelName);
        }
    }

    private void notifyAllUsers(String message, String channelName) {
        for (IUser u : channels.get(channelName)) {
            u.receive(message);
        }
    }
}
