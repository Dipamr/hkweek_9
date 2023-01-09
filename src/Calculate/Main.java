package Calculate;
import java.util.Scanner;

import static Calculate.Calculator.calculateResult;

public class Main {
    public static void main(String[] args) {
        char c;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter first number");
            int a = sc.nextInt();
            System.out.println("enter Second number");
            int b = sc.nextInt();
            System.out.println("enter one operator(+,-,*,/,)");
            char op = sc.next().charAt(0);
            calculateResult(a, b, op);
            System.out.println("would you like to do more calculation?: y or n ");
            c = sc.next().charAt(0);

        } while(c == 'Y'  || c == 'y');

    }
}