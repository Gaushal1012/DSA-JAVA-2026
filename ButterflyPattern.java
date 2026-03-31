import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Butter Fly Rows: ");
        int n = sc.nextInt();
        for(int i = 1; i <= (2*n); i++){
            int count = 0;
            int row = i > n ? ((2*n) - i + 1) : i;
            int emptySpace = (2*n) - (2*row);
            for(int j = 1; j <= (2*n); j++){
                if(j <= row){
                    System.out.print("*");
                }
                if(j > row && emptySpace >= count){
                    System.out.print(" ");
                    count++;
                }
                if(j > row && emptySpace < count){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
