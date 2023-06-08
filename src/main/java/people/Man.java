package people;

public class Man extends Person{

    private String sex;
    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.sex = "male";

    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isRetired(Person person){
        if (person.getAge() >= 65)
        {System.out.printf("The person %s %s is retired\n", person.getFirstName(), person.getLastName());
            return true;}
        else  {System.out.printf("The person %s %s is not retired\n", person.getFirstName(), person.getLastName());
            return false;}
    };

    public void registerPartnership(Person woman){
        this.setPartner(woman);
    };

    public void deregisterPartnership(){
        this.setPartner(null);
    };
}
