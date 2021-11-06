package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// must declare component required detect spring managment component
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception{

        Publisher publisher = new Publisher();
        publisher.setName("Vinayak Chiluka");
        publisher.setAddress1("Kachiguda");
        publisher.setCity("Hyderabad");


        //important u might miss thisl below line
        publisherRepository.save(publisher);

        Author eric = new Author("Eric","Drama");
        Book ddd = new Book("AAa","CCC");
        eric.getBooks().add(ddd);

        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("ddd","ddds");
        noEJB.setPublisher(publisher);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);


        System.out.println("Started in BootStrap");
        System.out.println("No of books:: "+bookRepository.count());
        System.out.println("No of publisher:: "+publisherRepository.count());


    }
}
