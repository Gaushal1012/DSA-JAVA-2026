public class ClearBit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int position = 2;
        int bitMask = 1 << position;
        int newNum = (~bitMask) & n;

        System.out.print("New Number: " + newNum);
    }
}
