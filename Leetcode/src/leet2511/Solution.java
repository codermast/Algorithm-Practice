package leet2511;

public class Solution {
    public int captureForts(int[] forts) {
        int ret = 0;

        int selfCastleIndex = -1;
        int emptyCastleIndex = -1;

        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1) {
                selfCastleIndex = i;

                if (emptyCastleIndex != -1) {
                    ret = Math.max(Math.abs(emptyCastleIndex - selfCastleIndex) - 1, ret);
                    emptyCastleIndex = -1;
                }
            } else if (forts[i] == -1) {
                emptyCastleIndex = i;

                if (selfCastleIndex != -1) {
                    ret = Math.max(Math.abs(emptyCastleIndex - selfCastleIndex) - 1, ret);
                    selfCastleIndex = -1;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 0, 0, -1, 0, 0, 0, 0, 1};
        int[] arr2 = {0, 0, 1, -1};
        System.out.println(s.captureForts(arr));
        System.out.println(s.captureForts(arr2));
    }
}
