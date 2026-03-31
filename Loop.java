import java.util.*;

public class Loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //Print n Naturak numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        for(int i = 1; i<= n; i++){
            System.out.println(i);
            count++;
        }

        System.out.println("------------------- " + count);

        //Print Table of the number
        System.out.print("Enter a number to print its table: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    } 
}
