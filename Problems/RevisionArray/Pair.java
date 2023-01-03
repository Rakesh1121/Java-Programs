package Problems.RevisionArray;
import java.util.Scanner;

public class Pair {
    public static void PairArray(int number[]){

        for(int i=0; i<number.length; i++){
            int currentNum = number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("(" + currentNum + ", "+ number[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enter the value in Arrays: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        PairArray(number);
    }
    
}
//3 ,4, 6. 7