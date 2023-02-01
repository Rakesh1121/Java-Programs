package OOPS;
//constructor overloading: multiple function with a same name but different in argument or no of arrgument.

public class Constructor {
    public static void main(String[] args) {
        //Student s1 = new Student();
        //Student s2 = new Student("Rakeshkumar");
        //Student s3 = new Student(57);
        //Student s4 = new Student("vint", 232);

        Student s1 = new Student();
        s1.name = "Rakesh";
        s1.roll = 57;
        s1.password = "abcd";

        Student s2 = new Student();
        s2.password = "xyz";
    }
}

class Student{
    String name;
    int roll;
    String password;

    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student(){
        System.out.println("constructor is called...");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
