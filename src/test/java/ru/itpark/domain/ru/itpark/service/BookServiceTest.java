package ru.itpark.domain.ru.itpark.service;

import org.junit.jupiter.api.Test;
import ru.itpark.domain.SearchBook;
import ru.itpark.domain.ru.itpark.service.ru.itpark.BookRepository;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void create() {
    }

    @Test
    public void searchByAuthor() {
        BookRepository repository = new BookRepository();
        BookService service = new BookService (repository);
        String[] genre = {"drama", "fiction"};
        service.create ("Гайдар", "1-234-567-8910", genre);
        service.create ("Гайдар", "1-098-765-4321", genre);
        //service.create ("А. Гайдар", "1-098-765-4321", genre);
        //service.create ("Агата Кристи", "1-000-765-4321", genre);

        SearchBook[] books = service.searchByAuthor("Гайдар");
        //SearchBook [] author = service.searchByAuthor("Гайдар");
        assertEquals("Гайдар", books[0].getAuthor());
        assertEquals("Гайдар", books[1].getAuthor());
    }
}