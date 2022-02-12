package com.company;


public class Main {
    //Extends is a keyword used to inherit the properties of a class. Below given the syntax of extends keyword
    public static class My_Calculations extends  Calculations{
        public void  multiplication(int a, int b){
            c = a * b;
            System.out.println("Multiplication of two Numbers is "+c );

        }
    }
   public  class  InterfaceExample implements com.company.InterfaceExample{

       @Override
       public void fillUP() {

       }
   }
    public static void main(String[] args) {
        int a = 20; int b = 10;
	My_Calculations demo = new My_Calculations();
    demo.addition(a,b);
    demo.subtraction(a,b);
    demo.multiplication(a,b);
    }
}
