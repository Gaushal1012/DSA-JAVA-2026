public class TowerOfHanoi {
    public static void ArrangeRings(int n, String src, String helper, String desc){
        if(n == 1){
            System.out.println("Transfer Disk " + n + " from " + src + " to " + desc);
            return;
        }
        
        ArrangeRings(n-1, src, desc, helper);
        System.out.println("Transfer Disk " + n + " from " + src + " to " + desc);
        ArrangeRings(n-1, helper, src, desc);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrangeRings(n, "S", "H", "D");
    }
}

