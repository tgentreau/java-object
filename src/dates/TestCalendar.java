package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

        public static void main(String[] args) {
            Locale france = Locale.FRANCE;
            SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss", france);
            Calendar calendar = Calendar.getInstance();
            calendar.set(2016, 4, 19, 23, 59, 30);
            Date date = calendar.getTime();
            String str = formateur2.format(date);
            System.out.println(str);
        }

}
