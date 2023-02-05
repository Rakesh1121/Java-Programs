public class incrementOperator{
    public static int Operators(int number){
        int increment= number++;
        return increment;
    }
    public static void main(String[] args) {
        int a = 23;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int number = 33;

        Operators(number);
        System.out.println(Operators(number));
    }
}

