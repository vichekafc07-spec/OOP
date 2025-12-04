package user_exc;

public class ABABank {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount) throws BankException {
        if (balance>0){
            if (amount > balance){
                throw new BankException(amount);
            }else {
                balance -= amount;
                System.out.println("Current amount : " + balance);
            }
        }else {
            throw new BankException(amount);
        }
    }
}
