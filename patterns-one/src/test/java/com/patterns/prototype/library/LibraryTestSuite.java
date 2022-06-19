package com.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        Book bookOne = new Book("Book 1", "Author 1", LocalDate.now());
        Book bookTwo = new Book("Book 2", "Author 2", LocalDate.now());
        Book bookThree = new Book("Book 3", "Author 3", LocalDate.now());
        library.getBooks().add(bookOne);
        library.getBooks().add(bookTwo);
        library.getBooks().add(bookThree);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When

        //Then
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
