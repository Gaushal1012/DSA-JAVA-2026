import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Operation In 1 or 0: ");
        int opr = sc.nextInt();
        int n = 5; // 0101
        int position = 2;
        int bitMask = 1 << position;
        int newNum = 0;

        if (opr == 1) {
            newNum = bitMask | n;
            System.out.print("New Number: " + newNum);
        } else {
            newNum = (~bitMask) & n;
            System.out.print("New Number: " + newNum);
        }

    }
}
