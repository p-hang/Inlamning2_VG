package se.yrgo.gradle.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BookTest {
    //G
    @Test
    public void test2EqualBooks() {
        Book b1 = new Book(1, "Svenska 1", "A", "12345678", "", 200);
        Book b2 = new Book(1, "Svenska 1", "A", "12345679", "", 201);
        assertEquals(b1,b2);
    }

    //G
    @Test
    public void test2NonEqualBooks() {
        Book b1 = new Book(1, "Svenska 1", "A", "12345678", "", 200);
        Book b2 = new Book(2, "Svenska 2", "A", "12345768", "", 300);
        assertNotEquals(b1, b2);
    }
}
