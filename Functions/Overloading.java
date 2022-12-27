package Functions;
import java.util.Scanner;

public class Overloading {
    public static int Sum(int a, int b){
        return a+b;
    }

    public static int Sum(int a, int b, int c){
        return a+b+c;
    }

    public static float Sum(float a, float b){
        return a+b;
    }

    public static void main(String arg[]){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        //int num1 = sc.nextInt();
        //int num2 = sc.nextInt();
        //int num3 = sc.nextInt();

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        Sum(num1, num2);
        System.out.print(Sum(num1, num2));
    }
}

//Funtion Orerloading: Multiple Function with the same name but different parameter(parameter in term of dataype or in term of no of parameter) overloading does not depends on return type