package Problems.RevisionArray;
import java.util.*;

public class largestSmallestNum {
    public static int largestNum(int number[]){
        int temp = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            if(number[i]>temp){
                temp = number[i];
            }
        }
        return temp;
    }

    public static int SmallerNum(int number[]){
        int temp = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++){
            if(number[i]<temp){
                temp = number[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        largestNum(number);
        System.out.println("the largest number is: "+largestNum(number));
    }
}
