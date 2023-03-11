package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(1, "Angelika 1", "Golon");
    Product book2 = new Book(2, "Angelika 2", "Golon");
    Product book3 = new Book(3, "Black mirror", "Someone");
    Product book4 = new Book(4, "Rad Head", "None");
    Product smartphone1 = new Smartphone(5, "black", "Sony");
    Product smartphone2 = new Smartphone(6, "white", "Nokia");

    @BeforeEach
    public void add() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(smartphone1);
        manager.add(smartphone2);
    }

    @Test
    public void shouldAddProduct() {

        Product[] expected = {book1, book2, book3, book4, smartphone1, smartphone2};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBy2Names() {

        Product[] expected = {book1, book2};
        Product[] actual = manager.searchBy("Angelika");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByName() {

        Product[] expected = {smartphone2};
        Product[] actual = manager.searchBy("white");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchByNoName() {

        Product[] expected = {};
        Product[] actual = manager.searchBy("White");
        Assertions.assertArrayEquals(expected, actual);
    }
}

