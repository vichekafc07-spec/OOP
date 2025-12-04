package user_exc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ABABank abaBank = new ABABank();

        Scanner scanner = new Scanner(System.in);

        abaBank.setBalance(0);
        abaBank.deposit(100);

        System.out.println("Current Balance: $"+ abaBank.getBalance());
        double amount=0;
        try{
            System.out.print("Enter your money : ");
            amount = scanner.nextDouble();
            System.out.println("WithDraw $"+ amount);
            abaBank.withDraw(amount);
        }catch (BankException e){
            System.out.println("Error you don't have money: $" + e.getAmount());
        }
    }
}
