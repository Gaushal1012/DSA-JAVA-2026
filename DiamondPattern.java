import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n; i++) {
            int position = i > n ? i - n : n - i + 1;
            int lastPosition = (2 * n) - position;
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if (j >= position && j <= lastPosition) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}