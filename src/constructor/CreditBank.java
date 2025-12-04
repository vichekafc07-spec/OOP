package constructor;

public class CreditBank {
    private final String creditCardNo;
    private final int creditSecretNo;

    // Default Constructor
    public CreditBank(){
        this.creditCardNo = "000-0000-000";
        this.creditSecretNo = 123;
    }

    // Constructor param
    public CreditBank(String creditCardNo, int creditSecretNo) {
        this.creditCardNo = creditCardNo;
        this.creditSecretNo = creditSecretNo;
    }
    
    // Copy Constructor
    public CreditBank(CreditBank creditBank){
        this.creditCardNo = creditBank.creditCardNo;
        this.creditSecretNo = creditBank.creditSecretNo;
    }

    @Override
    public String toString() {
        return "CreditBank{" +
                "creditCardNo='" + this.creditCardNo + '\'' +
                ", creditSecretNo=" + this.creditSecretNo +
                '}';
    }
    public void display(){

    }
    public void display(int id){
        System.out.println(id);
    }
    public void display(int id,String name){
        System.out.println(id+name);
    }
}
