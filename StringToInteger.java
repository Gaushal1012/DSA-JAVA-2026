public class StringToInteger {
    public static int myAtoi(String s) {
        String result = "";
        boolean isNegative = false;
        boolean previousSpace = s.length() > 0 && s.charAt(0) == ' ';
        boolean signUsed = false;

        for (int i = 0; i < s.length(); i++) {

            // Skip leading spaces
            if (result.length() == 0 && previousSpace && s.charAt(i) == ' ') {
                continue;
            } else {
                previousSpace = false;
            }

            // Handle sign
            if (result.length() == 0 && s.charAt(i) == '+' && !signUsed) {
                signUsed = true;
                continue;
            }
            if (result.length() == 0 && s.charAt(i) == '-' && !signUsed) {
                result = "-";
                isNegative = true;
                signUsed = true;
                continue;
            }

            // If another sign appears → invalid
            if (result.length() == 0 && signUsed && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                return 0;
            }

            // Stop if not digit
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }

            // Add digit
            result = result + s.charAt(i);
        }

        // If no valid number
        if (result.length() == 0 || result.equals("-")) {
            return 0;
        }

        long num = 0;
        int start = 0;

        if (result.charAt(0) == '-') {
            start = 1;
        }

        for (int i = start; i < result.length(); i++) {
            int digit = result.charAt(i) - '0';
            num = num * 10 + digit;

            // Overflow check
            if (!isNegative && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (isNegative && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return isNegative ? (int)(-num) : (int)num;
    }

    public static void main(String[] args){
        String str = "+-12";
        int result = myAtoi(str);
        System.out.println("Result: " + result);
    }
}