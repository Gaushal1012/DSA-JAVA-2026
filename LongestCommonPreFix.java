import java.util.*;

public class LongestCommonPreFix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        String smallStr = str[0];
        String commonPrefic = "";
        boolean isTrue = true;

        for (int i = 1; i < str.length; i++) {
            smallStr = str[i].length() < smallStr.length() ? str[i] : smallStr;
        }

        for (int i = 0; i < smallStr.length(); i++) {
            if(!isTrue){
                break;
            }
            for (int j = 0; j < str.length; j++) {
                if (smallStr.charAt(i) != str[j].charAt(i)) {
                    isTrue = false;
                    break;
                }
            }
            commonPrefic = isTrue ? commonPrefic + smallStr.charAt(i) : commonPrefic;
        }

        System.out.print("Common Prefic: " + commonPrefic);
    }
}
