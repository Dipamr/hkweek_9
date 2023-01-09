package javaprograms;

import java.util.ArrayList;

//10. Write program and add all group members names in to array and iterates
//through for each loop and print your name.
public class Que_10 {
    public static void main(String[] args) {
        ArrayList<String> groupmembersnames = new ArrayList<>();
        groupmembersnames.add("Dipali");
        groupmembersnames.add("Sonia");
        groupmembersnames.add("Urvi");
        groupmembersnames.add("Bumika");
        groupmembersnames.add("Kuldip");
        System.out.println("ArrayList:" + groupmembersnames);
        //eachloop
        for (String names : groupmembersnames) {
            System.out.print("Dipali");
            break;

        }
    }
}