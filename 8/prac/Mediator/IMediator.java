public interface IMediator {
    void sendMessage(String message, IUser user, String channelName);
    void addUser(IUser user, String channelName);
    void removeUser(IUser user, String channelName);
    void sendPrivateMessage(String message, IUser fromUser, IUser toUser);
}
