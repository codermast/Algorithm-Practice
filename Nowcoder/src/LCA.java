public class LCA {
    public static int getLCA(int a, int b) {
        // write code here
        while(a != b){
            if (a < b){
                b /= 2;
            }else {
                a /= 2;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getLCA(4,7));
    }
}
