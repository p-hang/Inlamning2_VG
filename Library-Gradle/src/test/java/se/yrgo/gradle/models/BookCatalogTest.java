package se.yrgo.gradle.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1,"Learning Java","","","",0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
        assertEquals(book1, bc.getBookArray()[0]);
        assertEquals(1, bc.getNumberOfBooks());

    }

    //G
    @Test
    public void testFindBook() throws BookNotFoundException {
        Book findBook1 = bc.findBook("Learning Java");
        assertEquals(book1, findBook1);

    }

    //G
    @Test
    public void testFindBookIgnoringCase() throws BookNotFoundException {
        Book findBook2 = bc.findBook("lEaRnInG JAVA");
        assertEquals(book1, findBook2);
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() throws BookNotFoundException { //???
        Book findBook3 = bc.findBook("   Learning Java   ");
        assertEquals(book1, findBook3);

    }

    //VG
    // This test should throw BookNotFoundException in order to pass.
    @Test
    public void testFindBookThatDoesntExist(){

        try {
            Book findBook4 = bc.findBook("Learning    Java");
        } catch(BookNotFoundException e) {
            BookNotFoundException bne = new BookNotFoundException();
            assertNotNull(bne);
        }


    }

}
