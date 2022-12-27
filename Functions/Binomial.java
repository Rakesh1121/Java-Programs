package Functions;
import java.util.Scanner;

public class Binomial {
    public static int Factorial(int number){
        int fact = 1;
        for(int i=1; i<=number; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n and r: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int A = N - R;

        int n = Factorial(N); //factorial of n
        int r = Factorial(R); //factorial of r
        int a = Factorial(A); //factorial or n-r

        //Creating formula of Binomial
        int dino =  r * a;
        int B = n/dino;
        
        System.out.print(B);
    }
}