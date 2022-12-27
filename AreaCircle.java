import java.util.*;

public class AreaCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle: ");
        Scanner sc = new Scanner(System.in);
        Float rad = sc.nextFloat();
        Float Area = 3.14f * rad * rad;
        System.out.println("The Area of Circle is: "+Area);
    }
    
}
