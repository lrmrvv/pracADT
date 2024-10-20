public class Main {
    public static void main(String[] args) {
        Mediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Ali");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "Charl");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello, everyone!");
        user2.send("Hi, Alice!");
    }
}
