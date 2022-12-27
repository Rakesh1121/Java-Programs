package Problems;

import java.util.Scanner;

public class Additon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Additon = 0;
        int choice;
        int number;

        do{
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            Additon+=number;

            System.out.print("Do you want to continue? press 1 or not press 0: ");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println(Additon);

    }
    
}
