package hwweek_9;
//You have to represent a point in 2D space. Write a class with the name Point. The class needstwo
//fields (instance variables) with name x and y of type int.
//The class needsto have two constructors. The first constructor does not have any parameters(no-arg
//constructor). The second constructor has parameters x and y of type int and it needsto initialize the
//fields.
//Write the following methods(instance methods):
public class Point {
    private  int x;  //instance variable
    private int y;

    public Point() {
        System.out.println("no argument constructor");// zero argument
    }

    public Point(int x, int y) {  //two argument
        this.x=x;
        this.y=y;
    }

    public int getx() {               //intance method
        return x;
    }

    public int gety() {                    //intance method
        return y;
    }
    public void setx(int x){
        this.x=x;
    }
    public void sety(int y){             //intance method
        this.y=y;
    }
    public double distance(){
        return distance(0,0);

    }
    public double distance (int x,int y){
        return Math.sqrt((x-this.x)*(x-this.x)+ (y-this.y)*(y-this.y));
    }
    public double distance(Point secondPoint){
        return distance(secondPoint.x,secondPoint.y);
    }

    public static void main(String[] args) {                              //main method
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }


}
