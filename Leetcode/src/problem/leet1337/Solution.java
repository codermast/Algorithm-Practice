package problem.leet1337;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class LineCount {
    final int index;
    int count;

    public LineCount(int index, int count) {
        this.index = index;
        this.count = count;
    }
}

public class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ret = new int[k];

        if (k == 0 || mat.length == 0) {
            return ret;
        }
        
        /*
        *   大顶堆
        * */
        PriorityQueue<LineCount> queue = new PriorityQueue<>(k, new Comparator<LineCount>() {
            @Override
            public int compare(LineCount o1, LineCount o2) {
                if(o1.count == o2.count){
                    return o2.index - o1.index;
                }else{
                    return o2.count - o1.count;
                }
            }
        });

        for (int i = 0; i < mat.length; i++) {
            LineCount lineCount = new LineCount(i, 0);
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    lineCount.count++;
                } else {
                    break;
                }
            }
            if (queue.size() < k) {
                queue.add(lineCount);
            } else {
                LineCount peek = queue.peek();
                if (peek.count > lineCount.count) {
                    queue.poll();
                    queue.add(lineCount);
                }
            }
        }

        for (int i = 0; i < k ; i++) {
            LineCount poll = queue.poll();
            ret[k - i - 1] = poll.index;;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };

        Solution s = new Solution();
        int[] ints = s.kWeakestRows(arr, 3);
        System.out.println(Arrays.toString(ints));
    }
}
