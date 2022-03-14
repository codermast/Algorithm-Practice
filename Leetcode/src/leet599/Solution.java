package leet599;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new LinkedList<>();
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (i + j < minIndex) {
                        minIndex = i + j;
                        list = new LinkedList<>();
                        list.add(list1[i]);
                    } else if (i + j == minIndex) {
                        list.add(list1[i]);
                    }
                }
            }
        }
        String[] ret = new String[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
