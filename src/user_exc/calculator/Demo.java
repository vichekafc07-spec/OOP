package user_exc.calculator;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Operator operator = new Operator();
        double val1=0;
        double val2=0;
        char op;

        System.out.print("Enter val 1 :");
        val1 = scanner.nextDouble();
        System.out.print("Enter operator :");
        op = scanner.next().charAt(0);
        System.out.print("Enter val 2 :");
        val2 = scanner.nextDouble();

        if (op=='+'){
            try{
                operator.plus(val1,val2);
            }catch (CalculateException e){
                System.out.println("Error" + e.getEx());
            }
        } else if (op=='-') {
            try{
                operator.minus(val1,val2);
            }catch (CalculateException e){
                System.out.println("Error" + e.getEx());
            }
        }else if (op=='*') {
            try {
                operator.mul(val1, val2);
            } catch (CalculateException e) {
                System.out.println("Error" + e.getEx());
            }

        }
        else if (op=='/') {
            try {
                operator.divided(val1, val2);
            } catch (CalculateException e) {
                System.out.println("Error" + e.getEx());
            }

        }
    }
}
