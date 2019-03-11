package pl.bast14n.librarysystem.books.service;

import org.springframework.stereotype.Service;
import pl.bast14n.librarysystem.books.model.Book;

import java.util.List;

@Service
public interface BookService {

     Book getBookById(String id);

     List<Book> getAllBooks();

     void deleteBook(String id);

     void updateBook(String id,Book book);

     void createBook(Book book);
}
