import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=2; i<number; i++){

            if(number%2==0){
                System.out.println("Prime");
                break;
            }else{
                System.out.println("Not Prime");
                break;
            }
        }
    }   
}

