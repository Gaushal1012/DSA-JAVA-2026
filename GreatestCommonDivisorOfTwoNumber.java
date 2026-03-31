import java.util.*;

public class GreatestCommonDivisorOfTwoNumber {
    public int GCD(int num1, int num2){
        int gcd = num1 > num2 ? num2 : num1;
        int limit = num1 > num2 ? num2 : num1;
        int reminder = 0;

        for(int i = 0; i < limit; i++){
            reminder = num1 > num2 ? num1 % num2 : num2 % num1;

            if(reminder == 0){
                return num1 > num2 ? num2 : num1;
            }
            else{
                num1 = num1 > num2 ? num2 : num1;
                num2 = reminder;
            }
        }
        return gcd;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num - 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num - 2: ");
        int num2 = sc.nextInt();

        GreatestCommonDivisorOfTwoNumber greatestCommonDivisorOfTwoNumber = new GreatestCommonDivisorOfTwoNumber();
        int gcd = greatestCommonDivisorOfTwoNumber.GCD(num1, num2);

        System.out.print("GCD: " + gcd);
    }
}
