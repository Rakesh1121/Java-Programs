package BasicSortingAlgo;
//Pict the largest from the unsorted array and put it at the end of the arrays
//the time complexity of the this algo is O(n^2) because here we use 2 for loop one for outer loop(n) and anoter for inner loop which n-1-turn

public class BubbleSort {
    public static void bubbleSort(int arr[]){

        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {9, 4, 3, 12, 13};

        bubbleSort(arr);
        printArray(arr);
    }
}
