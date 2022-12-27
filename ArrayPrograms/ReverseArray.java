package ArrayPrograms;
import java.util.*;

public class ReverseArray {
    public static void revArray(int number[]){
        int first = 0, last = number.length-1;

        while(first<last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++; 
            last--;  
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

        revArray(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}
