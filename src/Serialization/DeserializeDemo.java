package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeserializeDemo {
    public static void main(String[] args) {

        DeserializeDemo demo = new DeserializeDemo();
        demo.deSerializingSingleUser();
        demo.deSerializingMultipleUser();
    }


    public void deSerializingSingleUser() {

        User user = null;
        try (FileInputStream fileIn = new FileInputStream("singleUser.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn))
        {
            user = (User) in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("User class not found");
            c.printStackTrace();
        }

        System.out.println("Deserialized User...");
        System.out.println(user);


    }

    public void deSerializingMultipleUser() {
        List<User> userList = new ArrayList<>();

        //try-with-resource
        try (FileInputStream fileIn = new FileInputStream("userList.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn))
        {
            userList = (List<User>) in.readObject();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("User class not found");
            c.printStackTrace();
        }

        System.out.println("Deserialized User List...");
        System.out.println(userList);

    }


}
