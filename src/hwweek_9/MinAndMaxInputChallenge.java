package hwweek_9;
import java.util.Scanner;
//2. -Read the numbers from the console entered by the user and print the
//minimumand maximum number the user has entered.
//-Before the user entersthe number, print the message Enter number:
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum
//number.
//Hint:
//-Use an endless while loop.
//-Create a class with the name MinAndMaxInputChallenge.

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        int count = 0;
        int max = 0;
        int min = 0;
        boolean first = true;

        Scanner minimumMAximumInput = new Scanner(System.in);
        while (true) {

            System.out.println("Enter a number: ");
            boolean hashNextInt = minimumMAximumInput.hasNextInt();
            count += 1;
            if (hashNextInt) {
                int storedNumber = minimumMAximumInput.nextInt();
                if (first) {
                    first = false;
                    min = storedNumber;
                    max = storedNumber;
                }

                if (storedNumber > max) {
                    max = storedNumber;
                }

                if (storedNumber < min) {
                    min = storedNumber;
                }

                if (count == 5) {
                    break;
                }
            } else {

                System.out.println("Invalid number");
                break;
            }

            minimumMAximumInput.nextLine();         }

        System.out.println("The minimum number of this: " + min);
        System.out.println("The maximum number of this: " + max);

        minimumMAximumInput.close();

    }
}





