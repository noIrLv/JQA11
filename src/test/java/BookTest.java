import netology.ru.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    Book book = new Book(1,"Преступление и наказание",500,"Фёдор Достоевский");

    @Test
    public void shouldFindByNameIfExist(){
        String nameToFind = "Преступление и наказание";
        Assertions.assertTrue(book.matches(nameToFind));
    }
    @Test
    void shouldNotFindByNameIfNotExist(){
        String nameToFind = "Мертвые Души";
        Assertions.assertFalse(book.matches(nameToFind));
    }

    @Test
    void shouldFindByAuthorIfExist(){
        String authorToFind = "Фёдор Достоевский";
        Assertions.assertTrue(book.matches(authorToFind));
    }

    @Test
    void shouldNotFindByAuthorIfNotExist(){
        String autorToFind ="Николай Гоголь";
        Assertions.assertFalse(book.matches(autorToFind));
    }
}
