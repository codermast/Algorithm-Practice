package leet1154;

public class Solution {
    public int dayOfYear(String date) {
        String[] arr = date.split("-");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        int[] monthDay = {31,0,31,30,31,30,31,31,30,31,30,31};
        monthDay[1] = getFebruaryDay(year);

        int sumDay = 0;
        for(int i = 0;i<month-1;i++){
            sumDay += monthDay[i];
        }
        sumDay += day;
        return sumDay;

    }

    /*
     *   判断是否为闰年
     * */
    private boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    /*
    *   二月的天数
    * */
    private int getFebruaryDay(int year){
        if(isLeapYear(year)){
            return 29;
        }else{
            return 28;
        }
    }
}
