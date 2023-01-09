package Problems.RevisionArray;
import java.util.*;

public class subArrays {
    public static void subArray(int number[]){
        
        for(int i=0; i<number.length; i++){
            int startNum = i;
            for(int j=i; j<number.length; j++){
                int lastNum = j;
                for(int k=startNum; k<=lastNum; k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enter the value in array in sorted format: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        subArray(number);
    }
    
}
