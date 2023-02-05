import java.util.Scanner;

public class BasicString {
    public static void main(String[] args) {
        //Method to declare the String.
        String name = new String("Rakesh");
        //Another Type to declare the String.
        String f_name = "Rakesh";
        String l_name = "Vishwakarma";

        //String Concatination: meaning adding the two or more string together
        String FullName = f_name + l_name;
        System.out.println(FullName);
        System.out.println(name);

        System.out.println("Enter the college name: ");
        Scanner sc = new Scanner(System.in);
        String CollegeName = sc.next(); // it only take one word of the sentence
        System.out.println(CollegeName);
        String CollegeName1 = sc.nextLine(); //the will take whole sentence
        System.out.println(CollegeName1);
    }
}
//String are Immutable: meaning we can not change the String
