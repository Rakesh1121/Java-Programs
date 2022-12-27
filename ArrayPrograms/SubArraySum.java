package ArrayPrograms;

import java.util.*;

public class SubArraySum {
    public static void sumSubArray(int number[]){
        int currnetNum = 0, maxSum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){

                }
            }
        }

    }
    public static void main(String[] args) {
        int number[] = {2,4,5,6,8,34};

        sumSubArray(number);
    }
}
