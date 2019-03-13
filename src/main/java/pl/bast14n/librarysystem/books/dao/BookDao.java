package pl.bast14n.librarysystem.books.dao;

import org.springframework.stereotype.Repository;
import pl.bast14n.librarysystem.books.model.Book;

import java.util.List;

@Repository
public interface BookDao {

    Book getBookById(String id);

    List<Book> getAllBooks();

    void deleteBook(String id);

    void updateBook(String id,Book book);

    void createBook(Book book);
}
