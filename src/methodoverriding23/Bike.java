package methodoverriding23;

public class Bike extends Vehical {
    public void run() {                     //parentclass method
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {                            //main method create object
        Bike obj=new Bike();
        obj.run();                                                       //calling method
    }
}