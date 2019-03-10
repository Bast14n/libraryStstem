package pl.bast14n.librarysystem.books.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Pattern(regexp = "^[B]{1}[0-9]+", message = "you entered wrong ID (ID must start with B)")
    private String id;
    private String title;
    private String author;
    private String isbn;
    private String category;
    private int quantity;
}
