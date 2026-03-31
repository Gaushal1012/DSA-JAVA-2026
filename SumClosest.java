import java.util.*;

public class SumClosest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of N: ");
        int n = sc.nextInt();
        System.out.println("Enter The Value Of Target: ");
        int target = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n - 2; i++) {
            // for(int j = i + 1; j < n - 1; j++) {
            //     for(int k = j + 1; k < n; k++) {
            //         int temp = arr[i] + arr[j] + arr[k];

            //         if(i == 0 && j == 1 && k == 2) {
            //             sum = temp;
            //         } else {
            //             sum = Math.abs(target - sum) > Math.abs(target - temp) ? temp: sum;
            //         }
            //     }
            // }
            int j = i + 1;
            int k = n - 1;
            while (k > j) { 
                int temp = arr[i] + arr[j] + arr[k];
                if(i == 0 && j == 1 && k == n-1) {
                    sum = temp;
                    j++;
                    k--;
                } else {
                    sum = Math.abs(target - sum) > Math.abs(target - temp) ? temp: sum;
                    j++;
                    k--;
                }
            }
        }

        System.out.print("Sum: " + sum);
    }
}
