package OOPS;

public class Oops2 {
    public static void main(String[] args) {
       Person p1 = new Person(44, "Ram");
       //p1.name = "Rakesh";
       //p1.age = 22;
      
       Person p2 = new Person(31, "vinit");
       //p2.age = 23;
       //p2.name = "Vishal";

       //System.out.println(p1.name);

       p1.walk();
       p2.eat();

       p1.walk(3);

       Student s1 = new Student(32, "ramesh");
       s1.eat();

    }  
}

class Person{
    String name = "mahesh";
    int age = 32;

    public Person(int newAge, String newName){
        name = newName;
        age = newAge;
    }

    void walk(){
        System.out.println(name + " is waking");
    }

    void walk(int step){
        System.out.println(name + " is wake a " + step + " step");
    }

    void eat(){
        System.out.println(name + " is eating");
    }

}

class Student extends Person{
    public Student(int newAge, String newName) {
        super(newAge, newName);
        //TODO Auto-generated constructor stub
    }
}
