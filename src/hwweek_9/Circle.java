package hwweek_9;
//11. Sum Calculator
//Write a class with the name SimpleCalculator. The class needstwo fields(instance variables) with
//names firstNumber and secondNumber both of type double.

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        if (radius < 0) {
            radius = 0;
            return radius;
        } else {
            return radius;
        }
    }
        public double getArea(){
            double area = (radius * radius * Math.PI);
            return area;
        }

    }



