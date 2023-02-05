public class BasicString1 {
    public static void main(String[] args) {
        String name = "Rakesh vishwakarma";
        System.out.println(name.length());
        //.Lenght function is used for find the length of the string.

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));
        //CharAt is used for printing the charater present at the given index 

        //Printing every single letter of String by using loops
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
    
}
