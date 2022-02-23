package problem.leet622;


//  设计循环队列

class MyCircularQueue {

    private int[] arrQueue;
    private int front;
    private int tail;
    private int size;


    // MyCircularQueue(k): 构造器，设置队列长度为 k 。
    public MyCircularQueue(int k) {
        arrQueue = new int[k + 1];
    }
    //enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        arrQueue[tail] = value;
        tail =  (tail + 1) % arrQueue.length;
        size++;
        return true;
    }

    // deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }

        arrQueue[front] = 0;
        front = (front + 1) % arrQueue.length;
        size --;
        return true;
    }

    // Front: 从队首获取元素。如果队列为空，返回 -1 。

    public int Front() {
        if(isEmpty()){
            return -1;
        }

        return arrQueue[front];
    }

    // Rear: 获取队尾元素。如果队列为空，返回 -1 。
    public int Rear() {
        if(isEmpty()){
            return -1;
        }

        return arrQueue[(tail - 1 + arrQueue.length ) % arrQueue.length];
    }

    // isEmpty(): 检查循环队列是否为空。
    public boolean isEmpty() {
        return size == 0;
    }

    //isFull(): 检查循环队列是否已满。
    public boolean isFull() {
        return size == arrQueue.length - 1;
    }

    // 获取长度
    public int getSize() {
        return size;
    }

    /*
    *   方便打印测试
    *       重写 toString()方法
    * */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i = front;i<tail;){
            sb.append(arrQueue[i] + ",");
            i = (i + 1) % arrQueue.length;
        }
        sb.setCharAt(sb.length() - 1,']');

        return sb.toString();
    }


    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        myCircularQueue.enQueue(5);
        // [5]
        System.out.println(myCircularQueue);

        myCircularQueue.enQueue(3);
        // [5,3]
        System.out.println(myCircularQueue);

        myCircularQueue.enQueue(1);
        // [5,3,1]
        System.out.println(myCircularQueue);

        myCircularQueue.deQueue();
        // [3,1]
        System.out.println(myCircularQueue);

        // 3
        System.out.println(myCircularQueue.Front());
        // 1
        System.out.println(myCircularQueue.Rear());

        // false
        System.out.println(myCircularQueue.isEmpty());
        // false
        System.out.println(myCircularQueue.isFull());
    }
}
