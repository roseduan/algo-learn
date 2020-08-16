package datastructure.queue;

/**
 * @author: roseduan
 * @date: 2019/5/31 14:32
 * @description: 循环队列的另一种实现，只是代码处理略有不同
 */
public class CircularQueue2 {
    private String[] data;

    private int capacity;
    private int size;

    private int head;
    private int tail;

    public CircularQueue2(int capacity) {
        this.data = new String[capacity];
        this.capacity = capacity;
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    /**
     * 入队列
     */
    public void enqueue(String value) {
        //队列满了
        if (size == capacity) {
            return;
        }
        data[tail ++] = value;
        if (tail == capacity){
            tail = 0;
        }
        this.size++;
    }

    /**
     * 出队列
     */
    public String dequeue() {
        //队列为空
        if (size == 0) {
            return null;
        }
        String result = data[head];
        data[head ++] = null;
        if (head == capacity){
            head = 0;
        }
        this.size --;
        return result;
    }

    /**
     * 队列中元素个数
     */
    public int size() {
        return this.size;
    }

    /**
     * 打印队列中数据
     */
    public void print() {
        if (size == 0){
            return;
        }
        int h = head;
        int t = tail;

        if (h == t){
            t = t - 1;
            if (t == -1){
                t = capacity - 1;
            }
        }
        while(h != t) {
            System.out.print(data[h] + " ");
            h = (h + 1) % capacity;
        }
        System.out.print(data[t] == null ? "" : data[t] + "\n");
    }
}
