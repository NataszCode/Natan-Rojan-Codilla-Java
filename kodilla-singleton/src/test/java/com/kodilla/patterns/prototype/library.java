package com.kodilla.patterns.prototype;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        // Given
        Library library = new Library("My Library");
        Book book1 = new Book("Title1", "Author1", LocalDate.of(2020, 1, 1));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(2021, 2, 2));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(2022, 3, 3));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.name = "Cloned Library";
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.name = "Deep Cloned Library";
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        library.getBooks().remove(book1);


        assertNotNull(clonedLibrary);
        assertNotNull(deepClonedLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals("My Library", library.getName());
        assertEquals("Cloned Library", clonedLibrary.getName());
        assertEquals("Deep Cloned Library", deepClonedLibrary.getName());
    }
}
