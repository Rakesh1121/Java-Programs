package Functions;
import java.util.Scanner;

public class Program1 {
    public static void Hello(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }

    public static int CalculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static int product(int num1, int num2){
        int mul = num1*num2;
        return mul;
    }
    public static void main(String[] args) {
        //Hello();
        System.out.println("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        /*Calculate addtion
        CalculateSum(a, b);
        System.out.println(CalculateSum(a, b)); 
        */

        product(a, b);
        System.out.println(product(a, b));
    }
}
