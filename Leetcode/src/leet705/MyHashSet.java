package leet705;

import java.util.LinkedList;

public class MyHashSet {

    private LinkedList<Integer> list;

    public MyHashSet() {
        this.list = new LinkedList();
    }

    public void add(int key) {
        if(!contains(key)){
            list.add(key);
        }
    }

    public void remove(int key) {
        list.remove((Integer)key);
    }

    public boolean contains(int key) {
        for (Integer integer : list) {
            if(integer == key){
                return true;
            }
        }
        return false;
    }
}