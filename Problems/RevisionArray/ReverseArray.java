package Problems.RevisionArray;
import java.util.Scanner;

public class ReverseArray {
    public static void Reverse(int number[]){
        int start = 0, end = number.length-1, temp = 0;

        while(start<end){
            temp = number[start];
            number[start] = number[end];
            number[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of Array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        Reverse(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
    
}
