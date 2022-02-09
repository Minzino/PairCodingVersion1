import java.util.Date;

public class MyCalendar {
    public Date getToday() {
        Date date_now = new Date(System.currentTimeMillis());
        return date_now;
    }
}
