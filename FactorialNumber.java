import java.util.Scanner;

public class FactorialNumber {
    public int factorial(int a){
        int multiplication = 1;
        for(int i = a; i >= 1; i--){
            multiplication = multiplication * i;
        }
        return multiplication;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number A: ");
        int a = sc.nextInt();

        FactorialNumber factorialNumber = new FactorialNumber();
        int factorial = factorialNumber.factorial(a);
        System.out.print("Factorial: " + factorial);
    }
}
