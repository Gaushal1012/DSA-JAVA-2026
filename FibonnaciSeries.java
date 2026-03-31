import java.util.*;

public class FibonnaciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value Of N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int num1 = 0;
        int num2 = 0;

        for(int i = 0; i < n; i++){
            int sum = num1 + num2;
            num2 = num1;
            num1 = sum;
            if(i == 0){
                arr[i] = sum;
            }
            if(i == 1){
                arr[i] = 1;
                num1 = 1;
            }
            arr[i] = sum;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}