import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        char next;
        do {
            System.out.println("\t***CHOOSE AN OPERATION TYPE***\n1)ADDICTION\n2)SUBTRACTION\n3)MULTIPLICATION\n4)DIVISION\n5)SINE\n6)COSINE\n7)TANGENT\n");
            System.out.println("SELECT THE OPERATION BY NUMBER:\t");
            Scanner keyboard = new Scanner(System.in);
            int operator = keyboard.nextInt();
            double firstNum, secondNum, angle, result;

            switch (operator) {
                case 1:
                    System.out.println("INSERT 1° NUMBER:\t");
                    firstNum = keyboard.nextDouble();
                    System.out.println("INSERT 2° NUMBER:\t");
                    secondNum = keyboard.nextDouble();
                    result = firstNum + secondNum;
                    System.out.println("THE RESULT IS:\t" + result);
                    break;
                case 2:
                    System.out.println("INSERT 1° NUMBER:\t");
                    firstNum = keyboard.nextDouble();
                    System.out.println("INSERT 2° NUMBER:\t");
                    secondNum = keyboard.nextDouble();
                    result = firstNum - secondNum;
                    System.out.println("THE RESULT IS:\t" + result);
                    break;
                case 3:
                    System.out.println("INSERT 1° NUMBER:\t");
                    firstNum = keyboard.nextDouble();
                    System.out.println("INSERT 2° NUMBER:\t");
                    secondNum = keyboard.nextDouble();
                    result = firstNum * secondNum;
                    System.out.println("THE RESULT IS:\t" + result);
                    break;
                case 4:
                    System.out.println("INSERT 1° NUMBER:\t");
                    firstNum = keyboard.nextDouble();
                    System.out.println("INSERT 2° NUMBER:\t");
                    secondNum = keyboard.nextDouble();
                    result = firstNum / secondNum;
                    if (secondNum != 0) {
                        System.out.println("THE RESULT IS:\t" + result);
                    } else {
                        System.out.println("DIVISION BY 0 IS NOT POSSIBLE");
                    }
                    break;
                case 5:
                    System.out.println("INSERT ANGLE VALUE:\t");
                    angle = keyboard.nextDouble();
                    result = Math.sin(Math.toRadians(angle));
                    if (angle >= 361 || angle == 0) {
                        System.out.println("NON EXISTENT ANGLE");
                    } else {
                        System.out.println("SINE VALUE IS:\t" + result);
                    }
                    break;
                case 6:
                    System.out.println("INSERT ANGLE VALUE:\t");
                    angle = keyboard.nextDouble();
                    result = Math.cos(Math.toRadians(angle));
                    if (angle >= 361 || angle == 0) {
                        System.out.println("NON EXISTENT ANGLE");
                    } else {
                        System.out.println("COSINE VALUE IS:\t" + result);
                    }
                    break;
                case 7:
                    System.out.println("INSERT ANGLE VALUE:\t");
                    angle = keyboard.nextDouble();
                    result = Math.tan(Math.toRadians(angle));
                    if (angle >= 361 || angle == 0) {
                        System.out.println("NON EXISTENT ANGLE");
                    } else {
                        System.out.println("TANGENT VALUE IS:\t" + result);
                    }
                    break;

            }
            System.out.println("WOULD YOU LIKE TO DO ANOTHER OPERATION? [y/n]");
            next = keyboard.next().charAt(0);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } while (next == 'y');
    }
}
