package leet119;

import java.util.LinkedList;
import java.util.List;

public class Soluttion {
    /*
    *   独立动态规划
    * */
    public List<Integer> getRow(int rowIndex) {
        int lineIndex = 0;
        List<Integer> prve = new LinkedList<>();
        List<Integer> ret = new LinkedList<>();

        while(lineIndex <= rowIndex){
            for(int i = 0;i<=lineIndex;i++){
                if(i == 0 || i == lineIndex){
                    ret.add(1);
                }else{
                    ret.add(prve.get(i - 1) + prve.get(i));
                }
            }
            prve = ret;
            ret = new LinkedList<>();

            lineIndex ++;
        }

        return prve;
    }
    // 使用118的方法
    /*
    public List<Integer> getRow(int rowIndex) {
        return generate(rowIndex + 1).get(rowIndex);
    }

    public List<List<Integer>> generate(int numRows) {
        // 返回值
        List<List<Integer>> ret = new LinkedList<>();
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
    */
}
