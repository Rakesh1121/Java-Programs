package ArrayPrograms;
import java.util.*;

//the tC of this problem is O(n^3) because there are 3 loop

public class SubArraySumGreater {
    public static void sumSubArrayGreater(int number[]){
        int GreaterSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                sum = 0;
                for(int k=start; k<=end; k++){
                    //System.out.print(number[k] + " ");
                    sum = sum + number[k];
                }
                System.out.println(sum);
                if(sum>GreaterSum){
                    GreaterSum = sum;
                }
            }
        }
        System.out.println("The Greater sum of subarray is "+GreaterSum);
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.print("Enter the value in array: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        sumSubArrayGreater(number);
    }
}
