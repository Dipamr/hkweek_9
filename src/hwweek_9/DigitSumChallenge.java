package hwweek_9;

public class DigitSumChallenge {
    public static void main(String[] args) {
        int n=123456789;
        System.out.println("sum of all digit for number" + n + " = "+ sumDigits(n));
    }
    public static int sumDigits(int number){
        if(number <10){
            return -1;

        }else {
            int sum = 0;
            int temp = number;
        while (temp>0){

                sum+=temp%10;
                temp/=10;

            }
            return sum;

        }
    }

}
