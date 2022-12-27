package ArrayPrograms;

public class PairArray {
    public static void printPair(int number[]){
        int totalPair = 0;

        for(int i=0; i<number.length; i++){
            int currentNum = number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("(" + currentNum + ", "+ number[j] + ")");
                totalPair = totalPair + 1;
            }
            System.out.println();
        }
        System.out.println("Total pair = "+totalPair);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};

        printPair(number);
        
    }
}
//total pair= n(n-1)/2