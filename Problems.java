import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        int a = 45;
        int b = 34;
        int sum = a + b;
        System.out.println("The sum of a and b is: "+sum);

        System.out.println("Enter the Number is: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;
        System.out.println("The sum of input variable is: " + sum);

        int product = a * b;
        System.out.println("The Product of two number is: " + product);
    }
}

