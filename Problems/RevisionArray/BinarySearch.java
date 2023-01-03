package Problems.RevisionArray;
import java.util.Scanner;

public class BinarySearch {
    public static int Binary(int number[], int key){
        int start = 0, end= number.length-1;

        while(start<=end){
            int mid = end/2;
            if(number[mid] == key){
                return mid;
            }if(number[mid]>key){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        Binary(number, key);
        if(Binary(number, key)==-1){
            System.out.println("the key in not found");
        }else{
            System.out.println(Binary(number, key));
        }
    }
    
}
