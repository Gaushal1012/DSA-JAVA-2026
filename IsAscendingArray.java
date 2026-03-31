import java.util.Scanner;

public class IsAscendingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean isAsc = false;

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
        }

        for(int i = 0 ; i < n; i++){
            if(arr.length == 1){
                isAsc = true;
                break;
            }
            else{
                if(i > 0){
                    if(arr[i] >= arr[i-1]){
                        isAsc = true;
                    } else{
                        isAsc = false;
                        break;
                    }
                }
            }
        }

        System.err.print("Array is ASC: " + isAsc);
    }
}
