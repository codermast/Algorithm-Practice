package leet1716;

public class Solution {
    public int totalMoney(int n) {
        int ret = 0;
        // 如果不满一周
        if (n <= 7) {
            return numSum(n);
        }

        // 有几个周
        int week = n / 7;

        // 剩余几天
        int day = n % 7;

        // 加上整周的天数
        ret += week * 28 + numSum(week - 1) * 7;

        // 加上零碎的天数
        ret += numSum(day) + week * day;

        return ret;
    }

    public int numSum(int num) {
        int ret = 0;
        for (int i = 1; i <= num; i++) {
            ret += i;
        }
        return ret;
    }

    /*
     *   测试
     * */
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.totalMoney(4));
        System.out.println(s.totalMoney(10));
        System.out.println(s.totalMoney(20));
        System.out.println(s.totalMoney(26));
    }
}
