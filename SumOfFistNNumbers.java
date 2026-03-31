import java.util.*;

public class SumOfFistNNumbers {
    public static void sumOfNumber(int n, int sum){
        if(n==0){
            System.out.print("Sum: " + sum);
            return;
        }
        sum = sum + n;
        sumOfNumber(n-1, sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value Of N: ");
        int n = sc.nextInt();
        int sum = 0;
        sumOfNumber(n, sum);
    }
}
