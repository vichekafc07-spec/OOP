package overload;

public class Calculator {
    public void sum(){
        System.out.println("No values to sum");
    }
    public int sum(int a){
        return a + 1;
    }
    public float sum(int a,int b){
        return a + b;
    }
}