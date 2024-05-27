package CloneableInterface;

public class CloneExampleMain {

    public static void main(String[] args) {

        try{
            Address address = new Address("Milan", "via Padova");
            Person person1 = new Person("Amir", 32, address);

            System.out.println("Person 1 :" +person1);

            Person person2 = (Person) person1.clone();
            System.out.println("Person 2 :" +person2);

            //Change address of person 1
            person1.getAddress().setStreet("via Garibaldi");
            System.out.println("After modifying person1's address:");

            System.out.println("Person 1: " + person1);
            System.out.println("Person 2: " + person2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
