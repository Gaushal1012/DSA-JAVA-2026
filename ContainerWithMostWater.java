import java.util.*;

public class ContainerWithMostWater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];

        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }

        int area = 0;

        for(int i = 0; i < height.length-1; i++){
            for(int j = i+1; j < height.length; j++){
                int lenght = height[i] > height[j] ? height[j]: height[i];
                area = lenght * (j - i) > area ? lenght * (j - i) : area;
            }
        }

        System.out.print("Area: " + area);
    }
}