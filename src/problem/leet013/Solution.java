package problem.leet013;

public class Solution {
        public int romanToInt(String s) {
            char[] chars = s.toCharArray();
            int ret = 0;
            for(int i = 0;i<chars.length;i++){
                if(i != chars.length -1 && romonCharToInt(chars[i]) < romonCharToInt(chars[i +1])){
                    ret += -romonCharToInt(chars[i]) + romonCharToInt(chars[i +1]);
                    i++;
                }else{
                    ret += romonCharToInt(chars[i]);
                }
            }

            return ret;
        }

        /*
         *  罗马字符转换表
         * */
        public int romonCharToInt(char c){
            switch (c){
                case 'I':return 1;
                case 'V':return 5;
                case 'X':return 10;
                case 'L':return 50;
                case 'C':return 100;
                case 'D':return 500;
                case 'M':return 1000;
                default:return -1;
            }
        }

        public static void main(String[] args) {
            SwordFingerOffer.offer13.Solution s = new SwordFingerOffer.offer13.Solution();

            String str = "MCMXCIV";

            System.out.println(s.romanToInt(str));
        }
    }
