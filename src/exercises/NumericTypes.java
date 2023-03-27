package exercises;
import java.util.Scanner;

public class NumericTypes {
    public static void main (String[] args) {
       Scanner input = new Scanner(System.in);
       double length;
       double width;
       double area;

       System.out.println("Enter length:");
       length = input.nextDouble();
       System.out.println("Enter width:");
       width = input.nextDouble();
       input.close();
       area = width * length;
       System.out.format("Area is: %f", area);


    }
}
