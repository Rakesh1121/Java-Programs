package ArrayPrograms;

public class LinearSearchArray {
    public static int LinearSearch(int marks[], int key){
        for(int i=0; i<marks.length; i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {1,4,2,5,6,8,67,34,23,55};
        int key = 23;

        int index = LinearSearch(marks, key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println(index);
        }
    }
}
