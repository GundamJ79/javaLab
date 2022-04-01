package Student;

public class Tester {
    public static void main(String[] args) {
        Student firstStudent = new Student("Pippo","Franco","Very Bad","He's Dyslexic","Over the top",60);
        System.out.println(firstStudent);

        System.out.println("Starting class of firstStudent is:" + firstStudent.getClass().getName());
    }
}
