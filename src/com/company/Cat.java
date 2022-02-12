package com.company;

public class Cat extends  Animal{
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.setAge(5);
        cat.setName("Kitten");
        cat.setWeight(2);

        System.out.println(cat);
    }
}
