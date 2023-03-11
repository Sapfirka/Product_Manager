package ProductManager;

public class Book extends Product {
    private String author;

    public Book(int id, String name, String author) {
        super(id, name);
        this.author = author;
    }

    @Override
    public void use() {
        System.out.println("Читаем книгу: " + name);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
