package CopyConstructor;

public class CopyConstructorMain {

    public static void main(String[] args) {

        Address address = new Address("Milan", "via Padova");
        Person person1 = new Person("Amir", 32, address);

        System.out.println(person1);

        Person person2 = new Person(person1);
        System.out.println(person2);

        person1.getAddress().setStreet("via Loreto near Caiazzo");
        System.out.println(person2);


    }
}
