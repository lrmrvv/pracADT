public class User implements IUser {
    private String name;
    private IMediator mediator;

    public User(String name, IMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void send(String message, String channelName) {
        System.out.println(this.name + " sends message: " + message + " to channel: " + channelName);
        mediator.sendMessage(message, this, channelName);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " received: " + message);
    }

    @Override
    public String getName() {
        return name;
    }
    public void sendToOtherChannel(String message, String fromChannel, String toChannel) {
    System.out.println(this.name + " отправляет сообщение с " + fromChannel + " к " + toChannel);
    mediator.sendMessage(message, this, toChannel);
}

}
