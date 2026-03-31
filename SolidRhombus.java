import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = n - i;
            int emptySpace = 0;
            int printedStar = 0;
            for (int j = 1; j <= (2 * n) - 1; j++) {
                if(count >= j){
                   System.out.print("-");
                   emptySpace++;
                }
                else if(count < j && printedStar < n){
                   System.out.print("*");
                   printedStar++;
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}