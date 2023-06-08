package people;

public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public abstract boolean isRetired(Person person);

    public abstract void registerPartnership(Person partner);

    public abstract void deregisterPartnership();

    public void print(){
        System.out.printf("Name: %s\n", this.getFirstName());
        System.out.printf("Last name: %s\n", this.getLastName());
        System.out.printf("Age: %d\n", this.getAge());
        if (this.getPartner() == null)
        System.out.println("Not in a relationship\n");
        else System.out.printf("Married to: %s %s\n",this.getPartner().getLastName(), this.getPartner().getFirstName());
    }

}
