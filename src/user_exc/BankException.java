package user_exc;

public class BankException extends Exception{
    private final double amount;

    public BankException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
