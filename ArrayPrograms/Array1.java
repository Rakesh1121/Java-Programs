package ArrayPrograms;

public class Array1 {
    public static void main(String[] args) {
        int Marks[] = new int[3];
        Marks[0] = 45;
        Marks[1] = 76;
        Marks[2] = 98;

        //another type to store create array 
        //int numbers[] = {34, 57, 98};
        //System.out.println(numbers[2]);

        // for(int i=0 ; i<3 ; i++){
        //     System.out.println(number[i]);
        // }

        System.out.println("Phy = " + Marks[0]);
        System.out.println("Chem = " + Marks[1]);
        System.out.println("Math = " + Marks[2]);

        Marks[2] = 99;
        System.out.println("Marks After update Math = " + Marks[2]);

        //We can perform arthematic opetation in arrays
        Marks[0] = Marks[0] + 4;
        System.out.println("Marks After update Phy = " + Marks[0]);

        //length function to find length of the arrays
        System.out.println(Marks.length);
    }
}
