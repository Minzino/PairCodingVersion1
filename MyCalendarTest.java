import org.junit.jupiter.api.Test;

import java.util.Date;

public class MyCalendarTest {

    @Test
    void getTodayTest(){
        MyCalendar mycalendar = new MyCalendar();
        Date today = mycalendar.getToday();
        System.out.println(today);
    }


}
