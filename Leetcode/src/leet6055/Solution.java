package leet6055;

public class Solution {
    public static int convertTime(String current, String correct) {
        int curTime = getTimeNumByString(current);
        int corTime = getTimeNumByString(correct);

        int differ = corTime - curTime;

        int ret = 0;

        int surplus = differ % 60;
        ret += differ / 60;
        differ = surplus ;

        surplus = surplus % 15;
        ret += differ / 15;
        differ= surplus ;

        surplus = surplus % 5;
        ret += differ / 5;
        differ = surplus;

        ret += differ;
        return ret;
    }

    public static int getTimeNumByString(String time) {
        int ret = 0;
        ret += Integer.parseInt(time.substring(0, 2)) * 60;
        ret += Integer.parseInt(time.substring(3, 5));
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(convertTime("02:30", "04:35"));
        System.out.println(convertTime("11:00", "11:01"));
    }
}
