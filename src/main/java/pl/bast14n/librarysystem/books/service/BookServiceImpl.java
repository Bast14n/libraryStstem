package pl.bast14n.librarysystem.books.service;

import org.springframework.stereotype.Component;
import pl.bast14n.librarysystem.books.dao.BookDao;
import pl.bast14n.librarysystem.books.model.Book;

import java.util.List;

@Component
public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    public BookServiceImpl (BookDao bookDao){
        this.bookDao=bookDao;
    }

    @Override
    public Book getBookById(String id) {
        return bookDao.getBookById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }

    @Override
    public void updateBook(String id,Book book) {
        bookDao.updateBook(id, book);
    }

    @Override
    public void createBook(Book book) {
        bookDao.createBook(book);
    }


}
