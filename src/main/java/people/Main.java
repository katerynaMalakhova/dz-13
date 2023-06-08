package people;

public class Main {
    public static void main(String[] args) {
        Person man = new Man("manName", "manLastName", 60);
        Person woman = new Woman("womanName", "womanLastName", 60);

        man.print();
        woman.print();

        man.isRetired(man);
        woman.isRetired(woman);

        man.registerPartnership(woman);
        woman.registerPartnership(man);
        System.out.println("Partnership registered");
        man.print();
        woman.print();

        man.deregisterPartnership();
        woman.deregisterPartnership();
        System.out.println("Partnership deregistered");
        man.print();
        woman.print();
    }

}
