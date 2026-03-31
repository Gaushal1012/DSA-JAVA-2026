import java.util.*;

public class Hello{
    public static void main(String[] args){
        //Output
        // System.out.print("*\n***");

        //Calculator
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number 1: ");
        System.out.println("");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("Sum: Enter 1, Subtract: Enter 2, Multiply: Enter 3, Divide: Enter 4");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Sum: " + (a + b));
                break;
            case 2:
                System.out.println("Difference: " + (a - b));
                break;
            case 3:
                System.out.println("Product: " + (a * b));
                break;
            case 4:
                System.out.println("Quotient: " + (a / b));
                break;
        }
        
    }
}