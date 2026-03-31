public class GetBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int position = 2;
        int bitMask = 1 << position;

        if((n & bitMask) == 0){
            System.out.print("Bit is zero");
        } else{
            System.out.print("Bit is one");
        }
    }
}
