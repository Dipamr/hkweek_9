package javaprograms;
//7. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

import java.util.HashMap;

public class Que_7 {
    public static void main(String[] args) {                           //create object called people
        HashMap<String, Integer> people = new HashMap<String ,Integer>();
         people.put("Steve",35);
        people.put("Mark",30);
        people.put("Tony",31);
        for(String i:people.keySet()){

        System.out.println("key "+i+ "value:" +people.get(i));

    }

}

}