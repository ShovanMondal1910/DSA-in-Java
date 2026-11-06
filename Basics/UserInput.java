package Basics;
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Name is "+ name);

            System.out.print("Enter int number: ");
            int a ;
            a = sc.nextInt();
            
            System.out.print("Enter float number: ");
            float b;
            b = sc.nextFloat();
            
            int intSum;
            intSum =a+(int)b;
            System.out.println("Int Sum is : " + intSum);

            float floatSum = a + b ;
            floatSum = a+b;
            System.out.println("Float Sum :" + floatSum);
            
            double sub = a - b;
            System.out.println("Sub is : " + sub);
        } 
    }    
}
