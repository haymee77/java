package exception;

import java.util.*;

class AgeInputException extends Exception {
    public AgeInputException() {
        super("유효하지 않은 나이 입력");
    }
}

public class DefineException {

    public static void main(String[] args) {
        System.out.println("Age: ");

        try {
            int age = readAge();
            System.out.println("You are " + age + " years old.");
        } catch (AgeInputException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int readAge() throws AgeInputException {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age < 0) {
            AgeInputException excpt = new AgeInputException();
            throw excpt;
        }

        return age;
    }
}
