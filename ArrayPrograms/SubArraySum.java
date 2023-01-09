package ArrayPrograms;

//import java.util.*;

public class SubArraySum {
    public static void sumSubArray(int number[]){
        //int currnetNum = 0, maxSum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                int sum = 0; 
                for(int k=start; k<=end; k++){
                    System.out.print(number[k] + " ");
                    sum = sum + number[k];
                }
                System.out.println("The sum of this array is: "+sum);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {2,4,5,6,8,34};

        sumSubArray(number);
    }
}
