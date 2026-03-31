import java.util.Scanner;

public class MinMaxValueOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
        }

        int min = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                min = arr[i];
                max = arr[i];
            } else{
                max = arr[i] > max ? arr[i] : max;
                min = arr[i] < min ? arr[i] : min;
            }
        }

        System.out.print("Max: " + max);
        System.out.println();
        System.out.print("Min: " + min);
    }
}
