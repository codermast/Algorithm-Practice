package leet706;

import java.util.LinkedList;

public class MyHashMap {
    static class ListNode {
        int key;
        int val;

        ListNode() {
        }

        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    LinkedList<ListNode> list;

    public MyHashMap() {
        list = new LinkedList<>();
    }

    public void put(int key, int value) {
        for (ListNode listNode : list) {
            if (listNode.key == key) {
                listNode.val = value;
            }
        }
        list.add(new ListNode(key, value));
    }

    public int get(int key) {
        for (ListNode listNode : list) {
            if (listNode.key == key) {
                return listNode.val;
            }
        }
        return -1;
    }

    public void remove(int key) {
        list.removeIf(listNode -> listNode.key == key);
    }
}
