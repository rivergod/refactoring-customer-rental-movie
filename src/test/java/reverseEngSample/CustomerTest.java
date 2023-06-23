package reverseEngSample;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void statementTest() {

        String expected = "Statement\n" +
                "1-Movie1\t1500\n" +
                "1-Movie2\t2000\n" +
                "1-Movie3\t3000\n" +
                "2-Movie1\t1500\n" +
                "2-Movie2\t2000\n" +
                "2-Movie3\t6000\n" +
                "3-Movie1\t1500\n" +
                "3-Movie2\t3500\n" +
                "3-Movie3\t9000\n" +
                "4-Movie1\t3000\n" +
                "4-Movie2\t5000\n" +
                "4-Movie3\t12000\n" +
                "5-Movie1\t4500\n" +
                "5-Movie2\t6500\n" +
                "5-Movie3\t15000\n" +
                "Total\t76000\n" +
                "Bonus Point:\t19\n";

        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        PrintStream stdOut = System.out;
        System.setOut(new PrintStream(testOut));

        Customer me = new Customer("DO");

        me.addRental(new Rental(1, new Movie("1-Movie1", Movie.CLASSIC)));
        me.addRental(new Rental(1, new Movie("1-Movie2", Movie.REGULAR)));
        me.addRental(new Rental(1, new Movie("1-Movie3", Movie.RELEASE)));

        me.addRental(new Rental(2, new Movie("2-Movie1", Movie.CLASSIC)));
        me.addRental(new Rental(2, new Movie("2-Movie2", Movie.REGULAR)));
        me.addRental(new Rental(2, new Movie("2-Movie3", Movie.RELEASE)));

        me.addRental(new Rental(3, new Movie("3-Movie1", Movie.CLASSIC)));
        me.addRental(new Rental(3, new Movie("3-Movie2", Movie.REGULAR)));
        me.addRental(new Rental(3, new Movie("3-Movie3", Movie.RELEASE)));

        me.addRental(new Rental(4, new Movie("4-Movie1", Movie.CLASSIC)));
        me.addRental(new Rental(4, new Movie("4-Movie2", Movie.REGULAR)));
        me.addRental(new Rental(4, new Movie("4-Movie3", Movie.RELEASE)));

        me.addRental(new Rental(5, new Movie("5-Movie1", Movie.CLASSIC)));
        me.addRental(new Rental(5, new Movie("5-Movie2", Movie.REGULAR)));
        me.addRental(new Rental(5, new Movie("5-Movie3", Movie.RELEASE)));

        System.out.print(me.statement());

        System.setOut(stdOut);

        String actual = testOut.toString();

        assertEquals(expected, actual);
    }
}
