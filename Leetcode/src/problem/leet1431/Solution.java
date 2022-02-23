package problem.leet1431;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> list = new LinkedList<>();

            int maxCandy  = 0;
            for(int candy : candies){
                    if(candy > maxCandy){
                            maxCandy = candy;
                    }
            }

            for(int candy : candies){
                    if(candy + extraCandies >= maxCandy){
                            list.add(true);
                    }else{
                            list.add(false);
                    }
            }

            return list;
    }
}
