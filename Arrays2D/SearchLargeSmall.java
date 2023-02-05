package Arrays2D;
import java.util.*;

public class SearchLargeSmall {
    public static int large(int arr[][]){
        int Max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]>Max){
                    Max = arr[i][j];
                }
            }
        }
        return Max;
    }

    public static int small(int arr[][]){
        int Min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]<Min){
                    Min = arr[i][j];
                }
            }
        }
        return Min;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the arrays: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();

        //Taking input from the user
        int arr[][] = new int[n][m];
        System.out.println("Enter the values in the Arrays: ");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        large(arr);
        System.out.println("The Largest value in this array is: "+large(arr));

        small(arr);
        System.out.println("The Smallest value in the array is: " +small(arr));

    }
}
