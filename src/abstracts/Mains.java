package abstracts;

public class Mains {
    public static void main(String[] args) {
        var network = new Network();

        System.out.println(network.bookTitle());
        network = new Network("Book Title: " + "Data communication");
        System.out.println(network.getTitle());

        network.setTitle("ASP.Net Core MVC");
        System.out.println("Book Title: " + network.getTitle());
        Fruit.fruitName();

        var apple = new Apple();
        apple.fruitType();
    }
}