package ArrayPrograms;
//import java.util.*;

//the tC of this problem is O(n^2) because there are 2 loop
//this is approach is also called as prefix sum approach
//prefix[end] - prefix[start - 1]

public class subArraySumGreater2 {
    public static void SubArraySum(int number[]){
        int GreaterSum = Integer.MIN_VALUE;
        int sum = 0;
        int prefix[] = new int[number.length];

        //calculare prefix array\
        prefix[0] = number[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + number[i];
        }

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=0; j<number.length; j++){
                int end = j; 

                sum = start ==0 ? prefix[end] : prefix[end] - prefix[start - 1];

            }
            //System.out.println(sum); 
            if(sum>GreaterSum){
                GreaterSum = sum;
            }
        }
        System.out.println("The Greater sum of subarray is: "+ GreaterSum);
    }
    public static void main(String[] args) {
        int number[] = {5, -7, 9, 0, -2};

        SubArraySum(number);
    }
}
