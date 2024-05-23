package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SerializeDemo {
    public static void main(String[] args) {

        SerializeDemo demo = new SerializeDemo();
        demo.serializeSingleUser();
        demo.serializeMultipleUsers();

    }

    public void serializeSingleUser() {
        User user = new User(1, "Yashasvi Jaiswal", "password1234");

        try (FileOutputStream fileOut = new FileOutputStream("singleUser.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(user);
            System.out.println("Serialized single user data is saved in singleUser.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void serializeMultipleUsers() {
        User user1 = new User(1, "Rohit Sharma", "password1");
        User user2 = new User(2, "Virat Kohli", "password2");
        User user3 = new User(3, "MS Dhoni", "password3");
        User user4 = new User(4, "Rinku Singh", "password4");

        List<User> userList = Arrays.asList(user1, user2, user3, user4);

        try (FileOutputStream fileOut = new FileOutputStream("userList.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(userList);
            System.out.println("Serialized multiple users data is saved in userList.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
