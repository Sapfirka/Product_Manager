package ProductManager;

public class Main {
    public static void main(String[] args) {
        Product book = new Book(
                444,
                "Мечта",
                "Павел Ягодкин"
        );
        book.use();

        Product smartphone = new Smartphone(
                888,
                "Red",
                "Xiaomi"
        );
        smartphone.use();

    }
}