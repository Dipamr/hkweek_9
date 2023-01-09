package hwweek_9;

public class SimpleCalculator {
    public static void main (String [] args){
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setfirstNumber(5.0);
        calculator.setsecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setfirstNumber(5.25);
        calculator.setsecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
       }


    private double firstNumber;
    private double secondNumber;

    public double getfirstNumber() {
        return firstNumber;
    }

    public double getsecondNumber() {
        return secondNumber;
    }

    public void setfirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setsecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;

    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return this.secondNumber =0;
        }else{
            return firstNumber / secondNumber;
        }

        }

    }

