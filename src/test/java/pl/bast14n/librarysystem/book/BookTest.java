package pl.bast14n.librarysystem.book;

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
        Assert.assertEquals("789446",book.getIsbn());
        Assert.assertEquals("fantasy",book.getCategory());
        Assert.assertEquals(1,book.getQuantity());


    }
//    @Test
//    public void shouldnCreateBookWithWrongId(){
//        Book book = new Book("01","Diuna","Mark Herbert","789446","fantasy",1);
//
//
//    }
}
