package ArrayPrograms;
import java.util.*;

public class BinarySearchArray {
    public static int BinarySearch(int number[], int key){
        int start = 0, end = number.length-1;

        while(start<=end){
            int mid = (start + end )/2;

            if(number[mid]==key){
                return mid;
            }
            if(number[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
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

        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        BinarySearch(number, key);
        System.out.println(BinarySearch(number, key));
        
    }
}
// prerequisite of Binary search is our array should be in sorted format.