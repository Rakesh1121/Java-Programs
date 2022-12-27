package Functions;
import java.util.Scanner;

public class Factorial {
    public static int Factorial(int number){
        int fact=1;
        for(int i=1; i<=number; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Factorial(number);
        System.out.println(Factorial(number));

    }  
}
