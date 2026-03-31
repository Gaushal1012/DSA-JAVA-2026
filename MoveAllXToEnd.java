public class MoveAllXToEnd {
    public static String MoveElement(String str, String resultWX, String resultX, int n){
        if(n == str.length()){
            return resultWX + resultX;
        }

        if(str.charAt(n) == 'X'){
            resultX = resultX + 'X';
        }else{
            resultWX = resultWX + str.charAt(n); 
        }
        return MoveElement(str, resultWX, resultX, n + 1);
    }

    public static void main(String[] args){
        String str = "ABXCSXXSHGDF";
        String result = MoveElement(str, "", "", 0);
        System.out.println("Result: " + result);
    }
}
