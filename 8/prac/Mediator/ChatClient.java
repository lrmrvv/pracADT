public class ChatClient {
    public static void main(String[] args) {
        IMediator chatMediator = new ChatMediator();

        IUser user1 = new User("Laura", chatMediator);
        IUser user2 = new User("Ari", chatMediator);
        IUser user3 = new User("Cri", chatMediator);
        IUser user4 = new User("di", chatMediator);

        chatMediator.addUser(user1, "Общие");
        chatMediator.addUser(user2, "Общие");

        chatMediator.addUser(user3, "Виды спорта");
        chatMediator.addUser(user4, "Виды спорта");

        user1.send("Привет всем!", "Общие");
        user3.send("Давайте поговорим о спорте!", "Виды спорта");

        chatMediator.removeUser(user2, "Общие");
        user1.send("Где Боб?", "Общие");
    }
}
