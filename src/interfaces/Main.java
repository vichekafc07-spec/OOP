package interfaces;

public class Main {
    public static void main(String[] args) {
        var parot = new Parot();
        var food = new KhmerFood();
        parot.setType("Hello");
        System.out.println(parot.getType());
        parot.setTypes("cute");
        System.out.println(parot.getTypes());
        food.foodName();
        food.foodType();

    }
}