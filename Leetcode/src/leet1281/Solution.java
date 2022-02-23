package leet1281;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static int subtractProductAndSum(int n) {
        // 存储整数的各位数
        List<Integer> list = new LinkedList<>();

        while (n > 0){
            // 个位的数
            int num = n % 10;
            list.add(num);
            n /= 10;
        }

        // 此时list中存储的都是数字 n 的各个位数上的数字

        int product = 1;
        int sum = 0;

        for (int integer : list) {
            product *= integer;
            sum += integer;
        }

        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
