package OOPS; //this is package

public class Oops {
    public static void main(String[] args) { //our main function should be public and static also
        Pen p1 = new Pen(); //here we have created a pen object P1. object are stored in heap formated.
        p1.setColor("white");
        System.out.println("the color of the pen is: "+ p1.color);

        p1.setTip(5);
        System.out.println("the tip of the pen is: " + p1.tip);

        //another way of write this 
        p1.color = "Blue";
        System.out.println("the new color of pen is: "+ p1.color);

        Student s1 = new Student();
        s1.setStudentName("Rakeshkumar");
        int phy = 50;
        int math = 48;
        int chem = 56;

        System.out.println("the name of the student is: "+ s1.Student);

        s1.percentage(phy, math, chem);
        System.out.println("the percentage of Rakesh is: "+ s1.percentage);
    }
}

class Pen{ //this is Defalut Access modifier
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
//this are the class in java

class Student{
    String Student;
    int RollNo;
    float percentage;

    void setStudentName(String Name){
        Student = Name;
    }

    void percentage(int phy, int math, int chem){
        percentage = (phy + chem + math)/3;
    }   
}
/*
 Access modifier: (isse pata chalega ki  konsa data kisi accessible hoga)
 there are three type of Access modifier
 Default: with in class and within the package
 Public: all and outside of package
 Protected: with in class, within packages and outside package by subclass only
 private: only with in class
 */