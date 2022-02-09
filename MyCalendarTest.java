import org.junit.jupiter.api.Test;

import java.sql.Date;

public class MyCalendarTest {

    @Test
    void getTodayTest(){
        MyCalendar mycalendar = new MyCalendar();
        Date today = mycalendar.getToday();
        System.out.println(today);
    }

    @Test
    void createDateFromTest() {
        MyCalendar mycalendar = new MyCalendar();
        Date date = mycalendar.createDateFrom("2022", "02","09");

        System.out.println(date);
    }


}
