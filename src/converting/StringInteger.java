package converting;

public class StringInteger {
    public static void main(String[] args) {
        String s = "102";
        // Parse Integer
        int n = Integer.parseInt(s);
        System.out.println( n + 4);
        //second Practice regex
        String n1 = "age: 34";
        String n2 = "45 : demo ";
        n1 = n1.replaceAll("\\D+","") ;
        int n11 = Integer.parseInt(n1);
        n2 = n2.replaceAll("\\D+","") ;
        System.out.println("Convert using parser Int1: "+n11 + 10);
        System.out.println(n2);

        ///third convert using valueof not working into in
        int n4 = Integer.valueOf(s);
        System.out.println("Using Value of: " +n4 +1);

        ///third convert using valueof not working into in
        int n5 = new Integer(s).intValue();
        System.out.println("Using int Value: " +n5 +1);

    }
}
