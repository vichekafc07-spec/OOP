package user_exc.calculator;

public class Operator {
    private double val1,val2,total;

    public double getVal1() {
        return val1;
    }

    public double getVal2() {
        return val2;
    }

    public void plus(double val1, double val2) throws Exception{
        double total = val1 + val2;
        System.out.println("Total :" + total);
    }
    public void minus(double val1, double val2)throws Exception{
        double total = val1 - val2;
        System.out.println("Total :" + total);
    }
    public void mul(double val1, double val2)throws Exception{
        double total = val1 * val2;
        System.out.println("Total :" + total);
    }
    public void divided(double val1, double val2)throws Exception{
        double total = val1 / val2;
        System.out.println("Total :" + total);
    }
}
