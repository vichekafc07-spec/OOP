package exceptions;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        ReadKeys rk = new ReadKeys();
        String fullName = rk.readText("Input Full Name: ");
        String position = rk.readText("Input Position: ");
        int salary = rk.readInt("Input Salary: ");

        System.out.println("Full Name :" + fullName);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);

    }
}
