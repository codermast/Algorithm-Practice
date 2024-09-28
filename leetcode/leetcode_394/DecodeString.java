//package leetcode_394;
//
//public class DecodeString {
//
//    public String decodeString(String s) {
//        String numStr = "0123456789";
//        // 记录次数
//        int count = 0;
//        // 记录要循环的字符串
//        StringBuilder sb = new StringBuilder();
//        StringBuilder ret  =new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if (numStr.contains(String.valueOf(c))){
//                count = c - 48;
//            }else if (c == ']'){
//                ret.append(String.valueOf(sb).repeat(count));
//            }else if (c == '['){
//                sb = new StringBuilder();
//            }else {
//                sb.append(c);
//            }
//        }
//        return ret.toString();
//    }
//
//
//    public static void main(String[] args) {
//        DecodeString s = new DecodeString();
//
//        System.out.println(s.decodeString("3[a]2[bc]"));
//    }
//}
