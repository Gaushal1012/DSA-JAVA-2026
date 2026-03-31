public class PrintPermutation {
    public void PrintPermutationOfStr(String str, String permuteStr){
        if(str.length() == 0){
            System.out.println(permuteStr);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            PrintPermutationOfStr(newStr, permuteStr + currentChar);
        }
    }

    public static void main(String[] args){
        String str = "abc";

        PrintPermutation permutationOfString = new PrintPermutation();
        permutationOfString.PrintPermutationOfStr(str, "");
    }
}
