
import com.ironhack.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    Book book;



    @BeforeEach
    void setUp() {
        book = new Book("Manolito Gafotas", 150);
    }

    @Test
    @DisplayName("Test setNumPages works")
    void setNumPages_setsOK() {

        book.setNumPages(120);
        assertEquals(120, book.getNumPages());


    }

    @Test
    @DisplayName("Test addPagesRead  add int")
    void addPagesRead_addInt_OK() {

        book.addPagesRead(20);

        assertEquals(20, book.getPagesRead());

        book.addPagesRead(30);

        assertEquals(50, book.getPagesRead());
    }

    @Test
    @DisplayName("Test addPagesRead doesn't go further than numPages")
    void addPagesRead_addGreaterInt_pagesReadEqualsNumPages() {
        book.addPagesRead(149);
        assertEquals(149, book.getPagesRead());

        book.setPagesRead(0);
        book.addPagesRead(150);
        assertEquals(150, book.getPagesRead());

        book.setPagesRead(0);
        book.addPagesRead(151);
        assertEquals(150, book.getPagesRead());


    }

    @Test
    @DisplayName("Test addPagesRead negative int sums 0")
    void addPagesRead_negativeOrZero_OK() {

        book.addPagesRead(-10);
        assertEquals(0, book.getPagesRead());

        book.addPagesRead(-1);
        assertEquals(0, book.getPagesRead());

        book.addPagesRead(0);
        assertEquals(0, book.getPagesRead());


        book.addPagesRead(1);
        assertEquals(1, book.getPagesRead());


    }

    @Test
    @DisplayName("Test compare Arrays")
    void compareArraysOk() {

        List<String> categories = List.of("Fiction", "Teenagers");

        book.setCategories(categories);

        assertArrayEquals(book.getCategories().toArray(), List.of("Fiction", "Teenagers").toArray());

        assertFalse(book.getCategories().isEmpty());

        assertTrue(book.getCategories().size() == 2);


    }

}
