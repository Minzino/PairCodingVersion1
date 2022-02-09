import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
    public Date createDateFrom(String dateString) {
        SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyymmdd");

        // Date로 변경하기 위해서는 날짜 형식을 yyyy-mm-dd로 변경해야 한다.
        SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-mm-dd");

        java.util.Date tempDate = null;

        try {
            // 현재 yyyymmdd로된 날짜 형식으로 java.util.Date객체를 만든다.
            tempDate = beforeFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // java.util.Date를 yyyy-mm-dd 형식으로 변경하여 String로 반환한다.
        String transDate = afterFormat.format(tempDate);

        // 반환된 String 값을 Date로 변경한다.
        Date d = Date.valueOf(transDate);

        return d;
    }
}
