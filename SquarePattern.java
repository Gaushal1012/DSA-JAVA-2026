import java.util.*;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square pattern: ");
        int n = sc.nextInt();

        System.out.println("-----Numeric Square Pattern: -----");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }

        System.out.println("-----Numeric Square Pattern: -----");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
