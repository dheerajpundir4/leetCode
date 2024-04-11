import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Demo {
    public static void main(String[] args) {
        String dateString = "DEC 10 23:00:00 GMT 2023";
        String dateString2 = "DEC 10 01:00:00 GMT 2023";
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd HH:mm:ss z yyyy");

        try {
            Date date = sdf.parse(dateString);
            Date date2 = sdf.parse(dateString2);

            // If you want the timestamp in milliseconds
            long timestamp = date.getTime();
            long timestamp2 = date2.getTime();
            System.out.println("Timestamp in milliseconds: " + timestamp);
            System.out.println("Timestamp in milliseconds: " + timestamp2);

            System.out.println(timestamp2-timestamp);
            System.out.println((timestamp2-timestamp)/(15*60*1000));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
