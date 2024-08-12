package leetcode_1035;

public class UncrossedLines {

    // 不相交的线
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                count++;
                i++;j++;
            }
        }
        return count;
    }
}
