package ru.itpark;

import ru.itpark.domain.SearchBook;
import ru.itpark.domain.ru.itpark.service.BookService;
import ru.itpark.domain.ru.itpark.service.ru.itpark.BookRepository;

public class Main {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository();
        BookService service = new BookService(repository);
        String[] genre = {"drama", "fiction"};
        service.create("Хемингуэй", "1-234-567-8910",genre);
        System.out.println ("sss");

        repository.getAll();
        System.out.println ("eee");

    }
}
