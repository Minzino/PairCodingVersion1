import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyCalendarTest {

    @Test
    void getTodayTest(){
        MyCalendar mycalendar = new MyCalendar();
        Date sut = mycalendar.getToday();
        assertEquals(sut.toString(),new Date(System.currentTimeMillis()).toString());
    }

    @Test
    void createDateFromStringTest() {
        MyCalendar mycalendar = new MyCalendar();
        Date date = mycalendar.createDateFrom("2022", "02","09");

        System.out.println(date);
    }
    @Test
    void createDateFromStringsTest() {
        MyCalendar mycalendar = new MyCalendar();
        Date date = mycalendar.createDateFrom("20000101");

        System.out.println(date);
    }


}
