package ArrayPrograms;

public class SubArray {
    public static void subArr(int number[]){
        int totalSubArray = 0;

        for(int i=0; i<number.length; i++){
            int currnetNum = i;
            for(int j=i; j<number.length; j++){
                int lastNum = j;
                for(int k=currnetNum; k<=lastNum; k++){
                    System.out.print(number[k]+ " ");
                }
                System.out.println();
                totalSubArray++;
            }
            System.out.println();
        }
        System.out.print("The Total SubArray is "+totalSubArray);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};

        subArr(number);
    }
    
}
//SubArray is a continuous part of array 