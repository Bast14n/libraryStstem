package pl.bast14n.librarysystem;

import org.junit.Assert;
import org.junit.Test;
import pl.bast14n.librarysystem.books.model.Book;

public class BookTest {

    @Test
    public void shouldCreateBook (){
        Book book = new Book("B01","Diuna","Mark Herbert","789446","fantasy",1);

        Assert.assertEquals("B01",book.getId());
        Assert.assertEquals("Diuna",book.getTitle());
        Assert.assertEquals("Mark Herbert",book.getAuthor());


    }
}
