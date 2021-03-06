package guru.springframework.spring5webapp.controller;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookController(BookRepository repository, AuthorRepository authorRepository) {
        this.bookRepository = repository;
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }

    @RequestMapping("/authors")
    public String getAuthorList(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        return "authors/author_list";
    }
}
