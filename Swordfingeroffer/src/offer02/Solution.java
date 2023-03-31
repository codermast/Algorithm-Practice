package offer02;

public class Solution {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        char carry = '0';
        while(i >= 0 || j >= 0){
            char char_a ;
            char char_b ;
            if(i >= 0){
                char_a= a.charAt(i);
            }else{
                char_a= '0';
            }

            if(j >= 0){
                char_b= b.charAt(j);
            }else{
                char_b= '0';
            }

            if (char_a == '1' && char_b == '1'){
                if(carry == '1'){
                    sb.append("1");
                }else{
                    sb.append("0");
                    carry = '1';
                }
            }else if(char_a == '0' && char_b == '0'){
                if(carry == '1'){
                    sb.append("1");
                    carry = '0';
                }else{
                    sb.append("0");
                }
            }else{
                if(carry == '1'){
                    sb.append("0");
                }else{
                    sb.append("1");
                }
            }
            i --;
            j --;
        }
        if (carry == '1'){
            sb.append("1");
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        //System.out.println(addBinary("11", "10"));
        System.out.println(addBinary("1010","1011"));
    }
}
