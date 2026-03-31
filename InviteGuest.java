public class InviteGuest {
    public static int CallGuest(int n){
        if(n <= 1){
            return 1;
        }

        int callSignle = CallGuest(n - 1);
        int callPair = (n - 1) * CallGuest(n - 2);

        return  callSignle + callPair;
    }

    public static void main(String[] args){
        int n = 4;
        int totalCases = CallGuest(n);
        System.out.println(totalCases);
    }
}
