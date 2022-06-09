package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

        public static void main(String[] args) {
            SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss", Locale.FRANCE);
            Calendar calendar = Calendar.getInstance();
            calendar.set(2016, 6, 19, 23, 59, 30);
            Date date = calendar.getTime();
            String str = formateur2.format(date);
            System.out.println(str);
        }

}
