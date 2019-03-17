package ru.itpark.domain.ru.itpark.service;

import ru.itpark.domain.SearchBook;
import ru.itpark.domain.ru.itpark.service.ru.itpark.BookRepository;

public class BookService {
    private BookRepository repository;//создаем переменную репозиторий
    int index = 0;
    private int nextId = 1;//задаем поле для хранения следующего идентификатора

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void create(String author, String isbn, String[] genre) {
//сюда пишем, какие нам нужны поля для создания строчки массива, id не пишем, так как он присваивается программой
// по принципу плюс 1 к предыдущему зарегистрировавшемуся
        SearchBook book = new SearchBook(nextId, author, isbn, genre);
        repository.addBooks(book);
        nextId++;//прибавляет один иднетификатор
    }

    public SearchBook[] searchByAuthor(String author) {
        SearchBook[] result = new SearchBook[10];
        int resultIndex = 0;
        SearchBook[] books = repository.getAll();
        for (SearchBook book : books) {
            if (book == null) {
                continue;
            }
            if (book.getAuthor().contains(author)) {
                continue;
            }
            result[resultIndex] = book;
            resultIndex++;
        }
        return result;
    }

}

