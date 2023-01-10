package Arrays2D;
import java.util.Scanner;

public class Searching {
    public static boolean searchkey(int martix[][], int key){

        for(int i=0; i<martix.length; i++){
            for(int j=0; j<martix[0].length; j++){
                if(key==martix[i][j]){
                    System.out.println("the key is found at cell" + "(" + i + "," + j +")");
                    return true;
                }
            }
        }
        System.out.println("The key is not found");
        return false;
    }
    public static void main(String[] args) {
        int martix[][] = new int[3][3];

        int n = martix.length; 
        int m = martix[0]. length;
        
        System.out.print("Enter the value in the matrix: ");
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

        searchkey(martix, 5);
    }
    
}
