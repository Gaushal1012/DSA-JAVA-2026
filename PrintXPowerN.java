public class PrintXPowerN {
    public static int powerOfNum(int x, int n){
        if(n==0){
            return 1;
        }
        powerOfNum(x, n-1);
        return powerOfNum(x, n-1) * x;
    }

    public static int powerOfNumWithLonN(int x, int n){
        if(n==0){
            return 1;
        }
        if(n%2 == 0){
            return powerOfNumWithLonN(x, n/2) * powerOfNumWithLonN(x, n/2);
        }
        return powerOfNumWithLonN(x, n/2) * powerOfNumWithLonN(x, n/2) * x;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.print("powerOfNum: " + powerOfNum(x, n));
        System.out.println();
        System.out.print("powerOfNumWithLonN: " + powerOfNumWithLonN(x, n));
    }
}
