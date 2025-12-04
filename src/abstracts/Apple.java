package abstracts;

public class Apple extends Fruit implements IFood,ITaste{

    @Override
    public void foodType() {
        System.out.println("Apple is the best fruit");
    }

    @Override
    public float foodPrice() {
        return 0;
    }

    @Override
    public String tasteType() {

        return "";
    }
}