package jrr.by.lesson3.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private List<Book> books;

    @BeforeEach
    void initialization() {
        books = new ArrayList<>(Arrays.asList(
                new Book("Jackson", "Rainbow"),
                new Book("Nick", "The book"),
                new Book("J.Rowling", "Harry Potter")));
    }

    @Test
    void addBook() {
        Library library = new Library(books);
        assertEquals(4, library.addBook(new Book("Kate", "Home")).size());
    }

    @Test
    void addNullBook() {
        Library library = new Library(books);
        assertEquals(3, library.addBook(new Book()).size());
    }

    @Test
    void deleteBook() {
        Library library = new Library(books);
        assertEquals(2,
                library.deleteBook(new Book("Nick", "The book")).size());
    }

    @Test
    void deleteNullBook() {
        Library library = new Library(books);
        assertEquals(3, library.deleteBook(new Book()).size());
    }


    @Test
    void findBookByName1() {
        Library library = new Library(books);
        assertEquals(books.get(2),  library.findBookByName("Harry Potter"));
    }

    @Test
    void findBookByName2() {
        Library library = new Library(books);
        assertEquals(books.get(2),  library.findBookByName("potter"));
    }

    @Test
    void canNotFindBookByName() {
        Library library = new Library(books);
        assertNull(library.findBookByName("Mary"));
    }

    @Test
    void findBookByAuthor1() {
        Library library = new Library(books);
        List<Book> found = new ArrayList<>(Arrays.asList(books.get(0),books.get(1)));
        assertEquals(found,library.findBookByAuthor("ck"));
    }

    @Test
    void findBookByAuthor2() {
        Library library = new Library(books);
        List<Book> found = new ArrayList<>(Collections.singletonList(books.get(1)));
        assertEquals(found,library.findBookByAuthor("nick"));
    }

    @Test
    void cantFindBookByAuthor() {
        Library library = new Library(books);
        assertEquals(0,library.findBookByAuthor("Irina").size());
    }

    @Test
    void findBookByEmptyAuthor() {
        Library library = new Library(books);
        assertEquals(0, library.findBookByAuthor("").size());
    }
}