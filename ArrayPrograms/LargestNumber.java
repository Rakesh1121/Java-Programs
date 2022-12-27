package ArrayPrograms;
import java.util.*;

public class LargestNumber {
    public static int GreaterNum(int number[]){
        int lNum = Integer.MIN_VALUE;
        int sNum = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++){
            if(number[i]>lNum){
                lNum = number[i];
            }
            if(number[i]<sNum){
                sNum = number[i];
            }
        }
        System.out.println("The Smallest Number is: "+sNum);
        return lNum;
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

        GreaterNum(number);
        System.out.println("The Greater number is "+ GreaterNum(number));
    }
}
