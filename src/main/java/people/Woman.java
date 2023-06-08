package people;

public class Woman extends Person{

    private String sex;
private String maidenName;
    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.maidenName = lastName;
        this.sex = "female";
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isRetired(Person person){
        if (person.getAge() >= 60)
        {System.out.printf("The person %s %s is retired\n", person.getFirstName(), person.getLastName());
            return true;}
        else  {System.out.printf("The person %s %s is not retired\n", person.getFirstName(), person.getLastName());
            return false;}
    };

    public void registerPartnership(Person man){
        this.setPartner(man);
        this.setLastName(man.getLastName());
    };

    public void deregisterPartnership(){
        this.setPartner(null);
        this.setLastName(this.getMaidenName());
    };

}
