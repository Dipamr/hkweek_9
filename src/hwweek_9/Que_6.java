package hwweek_9;
import java.util.Scanner;
//6. Display right angle triangle of @ using nested for loops
//@
//@@
//@@@
//@@@@
//@@@@@
public class Que_6 {

    public static void main(String[] args) {
        int height;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height of triangle");
        height=sc.nextInt();
        System.out.println();
        for(int i=1; i<=height; i++){
            for(int j=1; j<=i; j++){
                System.out.print("@"+ " ");
            }
               System.out.println();
        }


        }

    }




