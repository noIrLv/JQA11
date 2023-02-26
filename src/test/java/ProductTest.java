import netology.ru.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    Product product = new Product(9, "Palit GameRock gtx 1080ti", 34999);
    @Test
    void shouldFindByNameIfExist() {
        String nameToFind = "Palit GameRock gtx 1080ti";
        Assertions.assertTrue(product.matches(nameToFind));
    }

    @Test
    void shouldNotFindByNameIfNotExist() {
        String nameToFind = "MSI RTX 4090";
        Assertions.assertFalse(product.matches(nameToFind));
    }


}
