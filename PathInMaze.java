public class PathInMaze {
    public static int PrintTotalPaths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }

        if(i == n - 1 && j == m - 1){
            return 1;
        }

        int downPath = PrintTotalPaths(i + 1, j, n, m);
        int rightPath = PrintTotalPaths(i, j + 1, n, m);

        return downPath + rightPath;
    }

    public static void main(String[] args){
        int n = 3;
        int m = 4;
        int totalPaths = PrintTotalPaths(0 , 0, n, m);
        System.out.println(totalPaths);
    }
}
