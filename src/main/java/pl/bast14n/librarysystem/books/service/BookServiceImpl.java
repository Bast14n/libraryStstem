package pl.bast14n.librarysystem.books.service;

import org.springframework.stereotype.Component;
import pl.bast14n.librarysystem.books.model.Book;

import java.util.List;

@Component
public class BookServiceImpl implements BookService{

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
    public void updateBook(String id,Book book) {

    }

    @Override
    public void createBook(Book book) {

    }


}
