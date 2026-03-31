import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int position = n - i + 1;
            int count = 0;
            int initialPosition = count == 0 ? ((2 * n) - position) : n - i + 1;
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == position && count < i && (initialPosition + position) == 2 * n) {
                    System.out.print(i);
                    count++;
                    position = position + 2;
                    initialPosition = initialPosition - 2;
                } else if (j < position && count > 0 && count < 2 && i != 1) {
                    if (n >= j) {
                        System.out.print(n - j + 1);
                    } else {
                        System.out.print(j - n + 1);
                    }
                    if (n - j + 1 == i || j - n + 1 == i) {
                        count++;
                    }
                    position = position + 1;
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}