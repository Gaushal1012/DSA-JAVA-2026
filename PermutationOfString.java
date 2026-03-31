public class PermutationOfString {
    public void PrintPermutation(String str, String permuteStr){
        if(str.length() == 0){
            System.out.println(permuteStr);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            PrintPermutation(newStr, permuteStr + currentChar);
        }
    }

    public static void main(String[] args){
        String str = "abc";

        PermutationOfString permutationOfString = new PermutationOfString();
        permutationOfString.PrintPermutation(str, "");
    }
}
