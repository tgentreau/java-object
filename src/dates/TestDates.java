package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String str = formateur.format(date);
        System.out.println(str);
        Date date1 = new Date(2016, 05, 19, 23,59,30);
        String str1 = formateur2.format(date1);
        System.out.println(str1);
    }
}
