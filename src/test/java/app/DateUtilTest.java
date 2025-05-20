package app;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateUtilTest {

    @Test
    public void testTodayNotNull() {
        assertNotNull(DateUtil.today());
    }

    @Test
    public void testDaysBetweenCorrect() {
        long days = DateUtil.daysBetween("2023-01-01", "2023-01-10");
        assertEquals(9, days);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDateFormat() {
        DateUtil.daysBetween("01-01-2023", "2023-01-10");
    }

    // intentionally failing test
    // @Test
    // public void testFailingCase() {
    //     assertEquals(100, DateUtil.daysBetween("2023-01-01", "2023-01-10")); // will fail
    // }
}