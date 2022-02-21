package arrays_prac;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*SINGLE DIMENSIONAL
-Single Dimensional or 1-D array is a type of linear array in which
elements are stored in a continuous row
====TWO DIMENSIONAL =====
Two Dimensional or 2-D array is array in which elements are stored in
rows and columns
=======MULTI DIMENSIONAL===
Multi Dimensional array is a type of array nested array

*/

import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws ParseException {
        int state1 = 502;
        int state2 = 2302;
        int state3 = 54202;
        int state4 = 51202;
        int state5 = 42302;
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current DateTime Before Formatting: " + now);


       String date1 = "Tue Apr 14 00:00:00 EAT 2020";

        String target = "Thu Sep 28 20:29:30 JST 2000";
        DateFormat df = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy", Locale.ENGLISH);
         //System.out.println(result);
       // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd HH:mm:ss Z yyyy");
       // LocalDateTime now = LocalDateTime.now();
        System.out.println(date1);
       // System.out.println(dtf.format(now));

    }
}
