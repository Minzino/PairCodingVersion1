import java.sql.Date;

public class MyCalendar {
    public Date getToday() {
        Date date_now = new Date(System.currentTimeMillis());
        return date_now;
    }

    public Date createDateFrom(String year, String month, String day) {
        String dateString = year+"-"+month+"-"+day;
        Date date = Date.valueOf(dateString);

        return date;
    }
}
