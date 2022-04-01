package Esercizio1;

public class Tester {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.setName("Pippo");
        firstPerson.setSurname("Franco");
        firstPerson.setAge(78);

        System.out.println(firstPerson);

        Person secondPerson = new Person("Pippo", "Franco", 80);
        System.out.println(secondPerson);
    }
}
