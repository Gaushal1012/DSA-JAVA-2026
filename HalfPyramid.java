import java.util.*;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.println("------------------------");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j - i <= 0) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }

        System.out.println("------------------------");

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------------");

        for (int i = 0; i < rows; i++) {
            for (int j = rows - 1; j >= 0; j--) {
                if (i - j >= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("------------------------");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("------------------------");

        for (int i = 1; i <= rows; i++) {
            int count = 1;
            for (int j = rows; j > 0; j--) {
                if (j - i >= 0) {
                    System.out.print(count);
                    count++;
                }
            }
            System.out.println();
        }

        System.out.println("------------------------");
        int sum = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sum + " ");
                sum++;
            }
            System.out.println();
        }

        System.out.println("------------------------");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if((i-j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
