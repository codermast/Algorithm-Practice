package problem.leet1108;

public class Solution {
    public static String defangIPaddr(String address) {
        String[] split = address.split("/.");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < address.length();i++){
            if(String.valueOf(address.charAt(i)).equals(".")){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
