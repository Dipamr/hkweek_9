package javaprograms;
//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names

import java.util.ArrayList;

public class Que_5 {
    public static void main(String[] args) {
        ArrayList<String> c=new ArrayList<String>();
        c.add("Jubile");
        c.add("Bakrloo");
        c.add("Central");
        c.add("Metropolitan");
        c.add("Ellizabeth");
        System.out.println("original array list"+c);
        System.out.println("checking above arraylist is empty or not!"+c.isEmpty());

    }
}
