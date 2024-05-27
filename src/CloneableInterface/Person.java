package CloneableInterface;

public class Person implements Cloneable{

    private String name;
    private int age;
    private Address address;

    //Regular Constructor
    public Person(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone(); //Deep copy of Address

        return cloned;
    }

    @Override
    public String toString() {
        return "Name: " + name  + " of age=" + age +
                "\nAddress: " + address.getStreet() + ", " + address.getCity();
    }
}
