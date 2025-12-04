package overload;

public class Main{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum();
        System.out.println(calculator.sum(12));
        System.out.println(calculator.sum(34,67));
    }
}