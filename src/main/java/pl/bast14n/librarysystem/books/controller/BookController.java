package pl.bast14n.librarysystem.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pl.bast14n.librarysystem.books.model.Book;
import pl.bast14n.librarysystem.books.service.BookService;

import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService=bookService;
    }

    @GetMapping("/books/book/{id}")
    public Book getBookById(
           @PathVariable String id){
        return bookService.getBookById(id);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/books/book/")
    public void createBook(@RequestBody Book book){
        bookService.createBook(book);

    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/books/book/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/books/book/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable String id){
        
    }

}
