package Problems.RevisionArray;
import java.util.*;

public class LinearSearch {
    public static int Linear(int number[] ,int key){
        for(int i=0; i<number.length; i++){
            if(key == number[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter the value in the array: ");
        int number[] = new int[size];
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        Linear(number, key);
        if(Linear(number, key) == -1){
            System.out.println("The key is not found");
        }
        else{
            System.out.println(Linear(number, key));
        }
    }
    
}
