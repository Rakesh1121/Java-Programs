package BasicSortingAlgo;
import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int arr[]){
        
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int pre = i-1;

            while(pre>=0 && arr[pre]>curr){
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre+1] = curr;
        }
    }

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};

        //insertionSort(arr);
        //Arrays.sort(arr); //array inbuild function to sorting which is better than all basic sorting algo
        Arrays.sort(arr,0,4);
        printArray(arr);
    }
}

//the time complexity of this arrays.sort is O(n logn) which is smaller than n^2 so it is faster than all basic sorting algo
//Arrays.sort(arr) and for particular index Arrays.sort(arr,starting index, ending index)

// and for reverse order we use collection framework: import.java.util.collections;
// Arrays.sort(arr, Collection.reverseOrder()) and Arrays.sort(arr, si, ei, Collection.reverseOrder())

