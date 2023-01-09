package hwweek_9;
//Example of Constructor Overloading

public class Student5 {                    //overload constructor
    int id;
    String name;
    int age;
    Student5(int i,String n){                                    //two arg costructor
        id=i;
        name=n;
    }
    Student5(int i,String n,int a){                               //three args constructor
        id =i;
        name = n;
        age =a;
    }
    public void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {                                     //main method create an object
        Student5 s1= new Student5(111,"Karan");
        Student5 s2= new Student5(222,"Aryan",25);
        s1.display();
        s2.display();

    }

}
