import java.util.*;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter Cols: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] tranarr = new int[cols][rows];
        for(int i = 0; i < cols; i++){
            for(int j = 0; j< rows; j++){
                tranarr[i][j] = arr[j][i];
            }
        }

        for(int i = 0; i < cols; i++){
            for(int j = 0; j< rows; j++){
                System.err.print(tranarr[i][j] + " ");;
            }
            System.err.println();
        }
    }
}
