package leet412;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for(int i = 1;i <= n;i++){
            StringBuilder sb = new StringBuilder();

            if(i % 5 == 0 && i % 3 == 0){
                sb.append("FizzBuzz");
            } else if(i % 5 == 0){
                sb.append("Buzz");
            }else if(i % 3 == 0){
                sb.append("Fizz");
            }else{
                sb.append(i);
            }

            list.add(sb.toString());
        }
        return list;
    }
}
