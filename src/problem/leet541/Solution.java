package problem.leet541;

public class Solution {

    public String reverseStr(String s, int k) {
        StringBuilder sb;
        // 当字符串长度小于2k时
        if(s.length() < k * 2){
            sb = new StringBuilder(s);
            return sb.reverse().toString();
        }else if(s.length() == k * 2){
            sb = new StringBuilder(s.substring(0,k * 2));

            return sb.reverse() + s.substring(k * 2 - 1);
        }else{
            StringBuilder ret = new StringBuilder();
            int surplus = s.length() - 2 * k;
            // 如果剩余字符少于 k 个，则将剩余字符全部反转。
            if(surplus < k) {
                sb = new StringBuilder(s.substring(0, k * 2));
                ret.append(sb.reverse());
                ret.append(s, k - 1, k * 2);
            }
            // 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。

            if(surplus < 2 * k && surplus >= k){

            }

        }
    }
}
