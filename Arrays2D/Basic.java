package Arrays2D;
import java.util.Scanner;

public class Basic {
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

        //printing  the 2darray
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
    
}
