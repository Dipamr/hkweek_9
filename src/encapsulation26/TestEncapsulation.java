package encapsulation26;

public class TestEncapsulation {                                 //main method object create, set variables
    public static void main(String[] args) {
        Encapsulate obj=new Encapsulate();
        obj.setName("Bhavesh");
        obj.setAge(19);
        obj.setRollNo(51);
        System.out.println("CodeBusters name:"+ obj.getName());
        System.out.println("CodeBusters name:"+ obj.getAge());
        System.out.println("CodeBusters name:"+ obj.getRollNo());



    }
}
