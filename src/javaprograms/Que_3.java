package javaprograms;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a new array list, add some colours(string) and
//printout the collection using for each loop.
public class Que_3 {
    public static void main(String[] args) {             //main method create colours list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("Purple");
        list_Strings.add("white");
        for(String element : list_Strings){                   //print list for eachloop
            System.out.println(element);
        }


    }
}
