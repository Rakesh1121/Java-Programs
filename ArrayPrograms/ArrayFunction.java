package ArrayPrograms;

public class ArrayFunction {
    public static void Update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {45, 43, 56};

        int nonChangable = 5;
        Update(marks, nonChangable);
        
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        //java use call by reference 
        System.out.println(nonChangable);
    }
    
}
