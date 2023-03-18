package leet146;


import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    static class Node {
        int key;
        int value;
        Node pre;
        Node next;
    }

    Map<Integer, Node> map;
    Node head;
    Node tail;
    int capacity;
    int size;

    public LRUCache(int capacity) {
        this.map = new HashMap<>(capacity);
        this.head = new Node();
        this.tail = new Node();
        this.capacity = capacity;
        this.head.next = this.tail;
        this.head.pre = null;
        this.tail.pre = this.head;
        this.tail.next = null;

        this.head.key = -1;
        this.head.value = -1;
        this.tail.key = -1;
        this.tail.value = -1;
        this.size = 0;
    }

    public int get(int key) {
        Node node = map.getOrDefault(key, null);

        // 存在该key时，则需要更新位置
        if (node != null) {
            // 将该结点从链表内断开，即将其pre结点和next结点连接起来
            node.pre.next = node.next;
            node.next.pre = node.pre;

            node.next = tail;
            node.pre = tail.pre;

            tail.pre.next = node;
            tail.pre = node;

            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node orDefault = map.getOrDefault(key, null);

        // 该key存在，则更新其内容
        if (orDefault != null) {
            orDefault.value = value;
            // 访问该get是为了更新后调整结点位置
            get(key);
        } else {
            Node node = new Node();
            node.key = key;
            node.value = value;

            // 在插入之前，先判断容量是否已满,容量已经满了，则需要先清理最久没使用的
            if (size >= capacity) {
                // head 的后一个结点为最久未被使用的
                Node next = head.next;
                map.remove(next.key);
                head.next = next.next;
                next.next.pre = head;
                size--;
            }
            // 此时必有空位，直接进行插入即可
            tail.pre.next = node;

            node.pre = tail.pre;
            node.next = tail;

            tail.pre = node;

            map.put(key, node);
            size++;
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));

        cache = new LRUCache(2);

        cache.put(1, 0);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));

        cache = new LRUCache(2);

        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
    }
}