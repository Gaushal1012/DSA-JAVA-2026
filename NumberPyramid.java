import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            int position = n-i+1;
            int count = 0;
            for(int j = 1; j<= 2*n - 1; j++){
                if(j == position && count < i){
                    System.out.print(i);
                    count++;
                    position = position + 2;
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
