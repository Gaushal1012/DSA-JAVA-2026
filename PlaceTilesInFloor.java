public class PlaceTilesInFloor {
    public static int TotalPossibleOpt(int n, int m){
        if(n == m){
            return 2;
        }

        if(n < m){
            return 1;
        }

        int vertical = TotalPossibleOpt(n - m, m);
        int horizontal = TotalPossibleOpt(n - 1, m);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 2;

        int totalOpts = TotalPossibleOpt(n, m);
        System.out.println(totalOpts);
    }
}
