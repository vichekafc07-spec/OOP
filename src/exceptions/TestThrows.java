package exceptions;

import java.util.Scanner;

public class TestThrows{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your age : ");
        int age = scanner.nextInt();
        isAgeValid(age);
    }

    private static void isAgeValid(int age) {
        if(age < 18){
            throw new ArithmeticException("You can't voting");
        }else {
            System.out.println("Age " + age + " can vote");
        }
    }
}
