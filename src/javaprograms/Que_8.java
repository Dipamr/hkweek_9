package javaprograms;
//8. Write the program that tell you which line pass through particular stations.
//Just use Zone 1 stations name.

import java.util.HashMap;

public class Que_8 {
    public static void main(String[] args) {
        HashMap<String ,String> stationlines = new HashMap<String ,String>();
        stationlines.put("Stonebridge park","Bakrloo");
        stationlines.put("Stratford","Central");
        stationlines.put("Wembley park","jubile");
        stationlines.put("Oxford circus","Picadilly");
        stationlines.put("Kingsbury","jubile");
        System.out.println();
        System.out.println(stationlines);
    }

}
