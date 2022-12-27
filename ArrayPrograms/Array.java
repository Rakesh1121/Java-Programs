package ArrayPrograms;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        
        //Declaration of Arrays
        int Number[] = new int[5];

        //Taking number in arrays by using loops
        for(int i=0; i<5; i++){
            Number[i] = sc.nextInt();
        }

        //Print number by using loops 
        for(int i=0; i<5; i++){
            System.out.println("Number = " + Number[i]);
        }
    }
}
