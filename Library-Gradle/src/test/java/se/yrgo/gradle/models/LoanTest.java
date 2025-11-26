package se.yrgo.gradle.models;

import org.junit.jupiter.api.Test;
import se.yrgo.gradle.utilities.GenderType;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoanTest {
    //VG
    @Test
    public void testDueDate() {
        Book book = new Book(1, "Svenska 1", "A", "12345678", "", 200);
        Customer customer = new Customer("Mr", "Michael", "Smith", "1 The High Street",
                "1234","a@b.com",1, GenderType.MALE);
        Loan loan = new Loan(1, customer, book);
        LocalDate today =  LocalDate.now();
        LocalDate due = loan.getDueDate();

        assertTrue(!due.isBefore(today) && !due.isAfter(today.plusDays(14)));
    }
}
