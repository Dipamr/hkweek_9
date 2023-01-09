package hwweek_9;
//1. Read 10 numbers from the console entered by the user and print the sum of
//thosenumbers.
//-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
//-If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read
//10 numbers.
//-Use the nextInt() method to get the number and add itto the sum.
//-Before the user enters each number, print the message Enter number #x: where x representsthe
//count, i.e. 1, 2, 3, 4, etc.
//-For example,the first message printed to the user would be Enter number #1:,the next Enter number
//#2:, and so on.
//Hint:
//-Use a while loop.
//-Use a counter variable for counting valid numbers.
//-Close the scanner after you don't need it anymore.
//-Create a class with the name ReadingUserInputChallenge.
import java.util.Scanner;
public class ReadingUserInputChallenge {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);


        System.out.println("enter 10 numbers");
        int number=0;
        int total=0;
        int counter=0;
        while(counter<10){
            System.out.println("enter number # "+ (counter +1));
            boolean hasNextInt = sc.hasNext();
            if(hasNextInt){
                number = sc.nextInt();
                counter++;
                total+=number;

            }else{
                System.out.println("invalid input");
                sc = new Scanner(System.in);
            }

        }
        sc.close();
        System.out.println("Thank you, your total is " + total);
    }


}


