package encapsulation26;
//19. Encapsulations example (Create package name ‘encapsulation26’ and create all
//below classes in this package)
public class Encapsulate {
    private String name;
    private int rollNo;
    private int age;

    public String getName() {                        //get method to access private variable name
        return name;
    }

    public void setName(String name) {                                   //set method to access private variable name
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int setRollNo(int i) {
        return rollNo;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    }




