package leet380;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomizedSet {

    Set<Integer> set;

    public RandomizedSet() {
        this.set = new HashSet<>();
    }

    public boolean insert(int val) {
        if (set.contains(val)){
            return false;
        }else {
            set.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if (set.contains(val)){
            set.remove(val);
            return true;
        }else {
            return false;
        }
    }

    public int getRandom() {
        Object[] objects = set.toArray();
        Random random = new Random();
        int i = random.nextInt(objects.length);
        return (int) objects[i];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */