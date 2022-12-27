import java.util.*;


public class Input {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("you have enter the number: "+ number);
        
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("you have enter the name is: "+name);

        System.out.println("enter the sentence: ");
        String name2 = sc.nextLine();
        System.out.println("the whole sentence is: "+ name2);
    }
}
/*
Input in java
next: this is used when you have capture only one word of sentence
nextLine: this  is used when you have capture whole sentence 
nextInt: this is used for capture a integer valure
nextByte: for byte 76
nextFloat: for float 
nextDouble: for Double 
nextBoolean: for Boolean
nextShort: for Short
nextLong: for Long
 */