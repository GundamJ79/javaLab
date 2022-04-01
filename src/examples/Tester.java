package examples;

public class Tester {
    public static void main(String[] args) {
        Person genericPerson = new Person("Ciccio","Pasticcio");
        System.out.println(genericPerson);

        Child littlePuppy = new Child("Ciccio","Graziani",3,true);
        System.out.println(littlePuppy);

        System.out.println("Starting class of genericPerson is:" + genericPerson.getClass().getName());
        System.out.println("Starting class of littlePuppy is:" + littlePuppy.getClass().getName());
    }
}
