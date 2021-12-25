package problem.leet118;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        // 返回值
        List<List<Integer>> ret = new LinkedList<>();
        if(numRows == 1){
            List<Integer> list = new LinkedList<>();
            list.add(1);
            ret.add(list);
            return ret;
        }

        int line = 1;

        while(line <= numRows){
            List<Integer> list = new LinkedList<>();

            for(int i = 0;i<line;i++){
                if(i == 0 || i == line - 1){
                    list.add(1);
                }else{
                    // 获取上一行
                    List<Integer> list1 = ret.get(line - 2);

                    int num = list1.get(i - 1) + list1.get(i);

                    list.add(num);
                }
            }

            ret.add(list);
            line++;
        }
        return ret;
    }

    public static void main(String[] args) {
        generate(5);
    }
}
