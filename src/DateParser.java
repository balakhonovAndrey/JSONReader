import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {

    public static Date getDate(String string) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-mm-dd");
        Date parsedDate = null;
        try {
            parsedDate = formater.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsedDate;
    }

    public static String getReadableDate1 (Date date) {
        SimpleDateFormat readableFormat = new SimpleDateFormat("dd.mm.yyyy");
        return readableFormat.format(date);
    }

    public static String getReadableDate2 (Date date) {
        SimpleDateFormat readableFormat = new SimpleDateFormat("dd.mm,yy");
        return readableFormat.format(date);
    }

    public static String getReadableDate3 (Date date) {
        SimpleDateFormat readableFormat = new SimpleDateFormat("dd/mm/yyyy");
        return readableFormat.format(date);
    }

    public static String getReadableDate4 (Date date) {
        SimpleDateFormat readableFormat = new SimpleDateFormat("dd/mm/yy");
        return readableFormat.format(date);
    }
}


