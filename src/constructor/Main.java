package constructor;

public class Main {
    public static void main(String[] args) {
        CreditBank creditBank;
        creditBank = new CreditBank();

        CreditBank creditBank1 = new CreditBank("236-9837-830",3829424);

        CreditBank creditBank2 = new CreditBank(creditBank);
        System.out.println(creditBank.toString());
        System.out.println(creditBank1.toString());
        System.out.println(creditBank2);
    }
}
