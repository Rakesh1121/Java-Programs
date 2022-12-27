public class Promotion {
    public static void main(String[] args) {
        int a = 45;
        long b = 568;
        float c = 32.67f;
        double d = 7675.34d;
        double sum = a + b + c + d;
        System.out.println(sum);
        long sum2 = a + b + (long)c + (long)d; 
        System.out.println(sum2);
    }
    
}
/*
 Type Promotion in Java
 basically here we promot our low stroage datatype into high stroage datatype
  */