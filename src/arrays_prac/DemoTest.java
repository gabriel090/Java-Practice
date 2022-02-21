package arrays_prac;

import javafx.util.Pair;

import java.util.Date;

public class DemoTest {

    public static void main(String[] args) {
        int demo[] = {1000};
        String vlString = "";
        String date2 = "Tue Apr 14 00:00:00 EAT 2020";
        String date4 = "Mon Feb 21 09:47:51 EAT 2022";
        Date date1 = new Date();
        String date3;

        System.out.println(date1);



        for (Integer i: demo){
           // System.out.println(i);
            if (i >= 4000){
                vlString = "Unsuppressed";
                //System.out.println("Unsuppressed");
            }else if(i >= 2000 && i <= 3999){
                vlString = "suppressed";
              //  System.out.println("suppressed");
            }else if(i >= 0 && i <= 1999){
                vlString = "Low virema";
               // System.out.println("");
            }
        }
        System.out.println(vlString);
    }
}
