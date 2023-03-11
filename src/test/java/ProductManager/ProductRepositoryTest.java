package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    ProductRepository repo = new ProductRepository();

    Product book1 = new Book(1, "Angelika 1", "Golon");
    Product book2 = new Book(2, "Angelika 2", "Golon");
    Product book3 = new Book(3, "Black mirror", "Someone");
    Product book4 = new Book(4, "Rad Head", "None");
    Product smartphone1 = new Smartphone(5, "black", "Sony");
    Product smartphone2 = new Smartphone(6, "white", "Nokia");

    @BeforeEach

    public void add() {
        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(book4);
        repo.add(smartphone1);
        repo.add(smartphone2);
    }

    @Test
    void removeById() {

        repo.removeById(3);
        Product[] expected = {book1, book2, book4, smartphone1, smartphone2};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {

        Product[] expected = {book1, book2, book3, book4, smartphone1, smartphone2};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldNoAddsl() {

        Product[] expected = {};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}