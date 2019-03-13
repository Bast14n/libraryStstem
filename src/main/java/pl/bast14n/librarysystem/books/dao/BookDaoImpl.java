package pl.bast14n.librarysystem.books.dao;

import org.springframework.stereotype.Component;
import pl.bast14n.librarysystem.books.model.Book;

import java.util.List;

@Component
public class BookDaoImpl implements BookDao{
    @Override
    public Book getBookById(String id) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public void deleteBook(String id) {

    }

    @Override
    public void updateBook(String id, Book book) {

    }

    @Override
    public void createBook(Book book) {

    }
}
