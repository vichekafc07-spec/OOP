package exceptions;

public class Mains {
    public static void main(String[] args) {
        try{
            int a= 5, b=0;
            int result = a / b;
            System.out.println("Result = " + result);
        }catch (ArithmeticException e){
            System.out.println("Error" + e.toString());
        }
        //--------------------------------------
        try{
            int ar[] = {2,4,6,8};
            System.out.println("Array last index = " + ar[4]);
        }catch (ArrayIndexOutOfBoundsException ar){
            System.out.println("Error" + ar.toString());
            ar.printStackTrace();
        }

    }
}