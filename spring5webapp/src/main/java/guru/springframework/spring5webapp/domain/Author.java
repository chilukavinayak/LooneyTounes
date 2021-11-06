package guru.springframework.spring5webapp.domain;

import java.util.List;

public class Author {

    private String firstName;
    private String LastName;
    List<Book> books;

    public Author(){

    }

    public Author(String firstName, String lastName, List<Book> books) {
        this.firstName = firstName;
        LastName = lastName;
        this.books = books;
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
