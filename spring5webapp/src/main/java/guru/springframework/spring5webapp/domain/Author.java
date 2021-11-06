package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.List;
//making jpa entity by providing jpa indentity value to store them in database

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String LastName;

    @ManyToMany(mappedBy = "authors")
    List<Book> books;

    public Author(){

    }

    public Author(String firstName, String lastName, List<Book> books) {
        this.firstName = firstName;
        LastName = lastName;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
