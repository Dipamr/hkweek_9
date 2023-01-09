package javaprograms;
//9. Write program and add all group names in to array and iterates through for
//each loop.

import java.util.ArrayList;

public class Que_9 {
    public static void main(String[] args) {
        ArrayList<String> groupnames = new ArrayList<>();
        groupnames.add("Java");
        groupnames.add("Selenium");
        groupnames.add("Postman");
        groupnames.add("Rest-Assured");
        System.out.println("ArrayList:"+ groupnames);
        //eachloop
        for(String names : groupnames){
            System.out.print(names);
            System.out.print(" , ");


        }

    }
}
