
import java.util.ArrayList;

public class PossibleSubsets {
    public static void PrintSubsets(int n, ArrayList<Integer> list){
        if(n == 0){
            System.out.println(list);
            return;
        }

        //Add
        list.add(n);
        PrintSubsets(n-1, list);

        //Add Nahi Hoga
        list.remove(list.size() - 1);
        PrintSubsets(n-1, list);
    }

    public static void main(String[] args){
        int n = 4;
        ArrayList<Integer> list = new ArrayList<>();
        PrintSubsets(4, list);
    }
}
