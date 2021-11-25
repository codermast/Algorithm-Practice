package problem.leet278;

import static problem.leet278.VersionControl.isBadVersion;
/* The isBadVersion API is defined in the parent class VersionControl.
  boolean isBadVersion(int version); */
/*
*   该类的作用仅是防止本地环境报错。
* */

public class Solution {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while(left < right){
            int middle = ((right - left) / 2) + left;

            // 中间都是坏的，则肯定在左边
            if(isBadVersion(middle)){
                right = middle;
            }else{ // 否则在右边
                left = middle + 1;
            }
        }
        // 此时退出循环则left == right
        return left;
    }
}

