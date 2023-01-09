package Calculate;

public class Calculator {


    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    public void division(int a, int b) {
        System.out.println(a / b);
    }

    public void multiplication(int a, int b) {
        System.out.println(a * b);

    }

    public static int calculateResult(int a, int b, char op) {

        int ans = 0;
        if (op == '+') {
            ans =a+b;
        }else if(op == '*'){
            ans =a*b;
        }else if(op =='/'){
            ans=a/b;
        }else if(op =='-'){
            ans = a-b;
        }
        System.out.println("your ansewr is "+ ans);
        return ans;
    }
}