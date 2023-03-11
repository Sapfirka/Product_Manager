package ProductManager;

public class Smartphone extends Product {
    private String name;
    private String manufacturer;

    public Smartphone(int id, String name, String manufacturer) {
        super(id, name);
        this.manufacturer = manufacturer;
    }

    @Override
    public void use() {
        System.out.println("Пользуюсь телефоном: " + name);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String author) {
        this.manufacturer = author;
    }
}
