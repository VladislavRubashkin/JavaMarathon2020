package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Vlad");
        User user2 = new User("Olga");
        User user3 = new User("Anton");

        user1.sendMessage(user2, "Hi, my name is Vlad");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi");
        user2.sendMessage(user1, "My name is Olya");
        user2.sendMessage(user1, "I'm fine!");

        user3.sendMessage(user1, "Hello");
        user3.sendMessage(user1, "Run to Offis");
        user3.sendMessage(user1, "I'm a programmer");

        user1.sendMessage(user3, "Ok");
        user1.sendMessage(user3, "I'm too");
        user1.sendMessage(user3, "Go");

        user3.sendMessage(user1, "You a WIN");

        MessageDatabase.showDialog(user1,user3);
        MessageDatabase.showDialog(user1, user2);

    }
}
