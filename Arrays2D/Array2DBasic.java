package Arrays2D;
import java.util.Scanner;

public class Array2DBasic {
    public static void main(String[] args) {
        int martix[][] = new int[3][3];

        int n = martix.length; // or n = 3 this is for rows
        int m = martix[0]. length; // or n=3 this is for cols
        
        System.out.println("Enter the value in the matrix: ");
        Scanner sc = new Scanner(System.in);
        //input in 2DArrays
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                martix[i][j] =  sc.nextInt();
            }
        }

        //For Output
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(martix[i][j]+ " ");   
            }
            System.out.println();
        }
    }
}