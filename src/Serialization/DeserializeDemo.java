package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializeDemo {
    public static void main(String[] args) {
        User user = null;

        //try-with-resource
        try (FileInputStream fileIn = new FileInputStream("user.ser");
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
}
