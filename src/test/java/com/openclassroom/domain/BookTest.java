package com.openclassroom.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book;

    @BeforeEach
    public void initiateBook(){
        book = new Book("name", "author", 1);
    }

    @AfterEach
    public void endBook(){
        book = null;
    }

    @Test
    void testGetNameMethod() {
        assertEquals("name", book.getName());
    }

    @Test
    void testGetAuthorMethod() {
        assertEquals("author", book.getAuthor());
    }

    @Test
    void testGetPriceMethod() {
        assertEquals(1, book.getPrice());
    }

    @Test
    void testSetAuthorMethod() {
        // Act
        book.setAuthor("authorTest");

        // Assert
        assertEquals("authorTest", book.getAuthor());
    }
}