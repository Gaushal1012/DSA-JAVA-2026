import java.util.Scanner;

public class FactorialNumberByRecursion {
    public static void factorialNum(int n, int result) {
        if(n == 0){
            System.out.print("Result: " + result);
            return;
        }
        result *= n;
        factorialNum(n-1, result);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int result = 1;
        factorialNum(n, result);
    }
}
