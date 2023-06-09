package ProductManager;

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("Продукт " + name + " используется");
    }
}
