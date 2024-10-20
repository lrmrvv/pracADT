public interface IUser {
    void send(String message, String channelName);
    void receive(String message);
    String getName();
}
