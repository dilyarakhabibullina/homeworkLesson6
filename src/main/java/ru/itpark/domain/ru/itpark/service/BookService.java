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
        repository.addBooks();
        nextId++;//прибавляет один иднетификатор
    }

    public SearchBook[] search(String author, String[] isbn, String genre) {
        SearchBook[] result = new SearchBook[10];
        int resultIndex = 0;

        return result;
    }

}

