package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializeDemo {
    public static void main(String[] args) {
        User user = new User(1, "Mohd Amir Ahmad", "password123");

        //try-with-resource
        try (FileOutputStream fileOut = new FileOutputStream("user.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(user);
            System.out.println("Serialized data is saved in user.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
