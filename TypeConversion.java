public class TypeConversion {
    public static void main(String[] args) {
        float a = 34.0f;
        int b = (int) a; //here we used type casting
        System.out.println("The value of integer: "+b);// in type casting we loss our data After of the decimal eg = 4.56 become 4

        int c = 24;
        float d = c; //int can convert into float but float cannot be convert into a int
        System.out.println("The value of float:"+d);

        char ch = 'a';
        int number = ch;
        char ch2 = 'b';
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
        char ch3 = 'A';
        int number3 = ch3;
        System.out.println(number3);
    }
}
/*
Type COnversion:
Conversion happen when:
type compatible and destination type is greater the source type 
byte > short > int > float > long > double
 */

