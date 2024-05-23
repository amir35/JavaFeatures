package Serialization;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private transient String password; // Sensitive data, not serialized

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', password='" + password + "'}";
    }
}
