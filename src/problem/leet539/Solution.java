package problem.leet539;

import java.util.*;

public class Solution {
    /*
     *   最小时间差
     * */
    public int findMinDifference(List<String> timePoints) {
        // 如果链表为空，则直接返回0
        if(timePoints == null){
            return 0;
        }

        // 即每个时间点都有，则最少有两个相等，则最小时间差为0
        if(timePoints.size() > 1440){
            return 0;
        }

        // 将所给的链表转换为数组
        String[] strArr = timePoints.toArray(new String[0]);

        // 将数组进行排序，传入自定义比较器
        // 将其按照字符串所代表的时间升序排列
        Arrays.sort(strArr, (o1, o2) -> {
            String[] arr1 = o1.split(":");
            String[] arr2 = o2.split(":");

            if (Integer.parseInt(arr1[0]) == (Integer.parseInt(arr2[0]))) {
                return Integer.parseInt(arr1[1]) - (Integer.parseInt(arr2[1]));
            } else {
                return Integer.parseInt(arr1[0]) - (Integer.parseInt(arr2[0]));
            }
        });

        // 最小时间差
        // 一般求最小值时，给最大的默认值，反之则反
        int minTimeDif = Integer.MAX_VALUE;
        // 遍历数组，求差
        for (int i = 0; i < strArr.length - 1; i++) {
            minTimeDif = Math.min(differ(strArr[i + 1], strArr[i]), minTimeDif);
        }
        // 最后一个数和第一个数的差，并求最小值
        return Math.min(Math.abs(1440 - differ(strArr[strArr.length - 1], strArr[0])), minTimeDif);
    }

    /*
     *   求两个字符串时间的分钟差
     *       格式：小时：分钟 HH:MM
     * */
    private int differ(String s2, String s1) {
        String[] arr1 = s1.split(":");
        String[] arr2 = s2.split(":");

        int a1 = Integer.parseInt(arr1[1]) + Integer.parseInt(arr1[0]) * 60;
        int a2 = Integer.parseInt(arr2[1]) + Integer.parseInt(arr2[0]) * 60;

        return a2 - a1;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        List<String> list = new LinkedList<>();
        list.add("01:01");
        list.add("02:01");
        list.add("03:00");

        System.out.println(s.findMinDifference(list));
    }
}
