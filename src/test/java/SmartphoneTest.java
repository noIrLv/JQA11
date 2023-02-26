import netology.ru.Book;
import netology.ru.Smartphone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneTest {
    Smartphone smartphone = new Smartphone(1, "One Plus 11", 63999,"One Plus");

    @Test
    public void shouldFindByVendorIfExist(){
        String vendorToFind = "One Plus";
        Assertions.assertTrue(smartphone.matches(vendorToFind));

    }
    @Test
    public void  shouldFindByVendorIfNotExitst(){
        String vendorToFind = "Samsung";
        Assertions.assertFalse(smartphone.matches(vendorToFind));
    }

    @Test
    public void shouldFindByModelIfExist(){
        String nameToFind = "One Plus 11";
        Assertions.assertTrue(smartphone.matches(nameToFind));
    }
    public void shouldFindByModelIfNotExitst(){
        String nameToFind = "Iphone 14 pro max";
        Assertions.assertFalse(smartphone.matches(nameToFind));
    }
}
