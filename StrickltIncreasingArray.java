import java.util.*;

public class StrickltIncreasingArray{
    public static boolean  IsStrickArray(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }

        if(arr[index] < arr[index+1]){
            return IsStrickArray(arr, index+1);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
        }

        boolean result = IsStrickArray(arr, 0);
        System.out.println("Result: " + result);
    }
}