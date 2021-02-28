package jrr.by.lesson3.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;

public class Library {

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Library(List<Book> list) {
        this.books = list;
    }

    @Override
    public String toString() {
        return "Library{" +
                "list=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    Logger logger = Logger.getLogger(Library.class);

    public List<Book> addBook(Book newBook) {
        if (newBook.getNameOfBook() != null) {
            books.add(newBook);
        }
        return books;
    }

    public List<Book> deleteBook(Book book) {
        if (book.getNameOfBook() != null) {
            books.remove(book);
        } else logger.info("Can't delete book!");
        return books;
    }

    public Book findBookByName(String name) {

        Book bookByName = null;

        for (Book book : books) {
            if (book.getNameOfBook().toLowerCase().contains(name.toLowerCase())) {
                bookByName = book;
                break;
            }
        }
        if (bookByName == null) {
            return null;
        } else {
            logger.info(bookByName.toString());
            return bookByName;
        }
    }

    public List<Book> findBookByAuthor(String author) {

        List<Book> found = new ArrayList<>();

        for (Book book : this.books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())
                    && !author.equals("")) {
                found.add(book);
            }
        }

        if (!found.isEmpty()) {
            logger.info(found.toString());
        } else {
            logger.info("Book is not found!");
        }
        return found;
    }
}
