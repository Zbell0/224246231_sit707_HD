package app;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilTest {

    @Test
    public void testIsWeekendTrue() {
        assertTrue(DateUtil.isWeekend("2023-12-30")); // Saturday
        assertTrue(DateUtil.isWeekend("2023-12-31")); // Sunday
    }

    @Test
    public void testIsWeekendFalse() {
        assertFalse(DateUtil.isWeekend("2023-12-29")); // Friday
    }

    @Test
    public void testGetDayOfWeek() {
        assertEquals("MONDAY", DateUtil.getDayOfWeek("2023-12-25"));
    }

    // ❌ intentional failing test
    @Test
    public void testFailingWeekendCase() {
        // 2023-12-29 is Friday, so this should fail
        assertTrue(DateUtil.isWeekend("2023-12-29"));
    }
}