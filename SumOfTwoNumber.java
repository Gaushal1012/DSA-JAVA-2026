import java.util.*;

public class SumOfTwoNumber {
    public int CalculateSum(int a, int b){
        return a + b;
    }

    public int CalculateMultiPlication(int a, int b){
        return a * b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value A: ");
        int a = sc.nextInt();
        System.out.print("Enter Value B: ");
        int b = sc.nextInt();

        SumOfTwoNumber sumOfTwoNumber = new SumOfTwoNumber();
        int sum = sumOfTwoNumber.CalculateSum(a,b);
        int multiplication = sumOfTwoNumber.CalculateMultiPlication(a, b);
        System.out.println("Sum: " + sum);
        System.out.println("multiplication: " + multiplication);
    }
}
