public class StringBuilders {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");

        sb.setCharAt(0, 'P');

        sb.insert(0, 'S');

        System.out.print(sb);
    }
}
