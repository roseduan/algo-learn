package datastructure.queue;

import java.util.Arrays;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/10/31 21:53
 * @description 使用数组实现简单队列
 */
public class ArrayQueue<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] data;
    private int capacity;
    private int size;
    private int head;
    private int tail;

    public ArrayQueue(int capacity) {
        this.data = new Object[capacity];
        this.capacity = capacity;
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 入队列
     */
    public boolean add(T value){
        if (tail == capacity) {
            //需要扩容
            if (head == 0) {
                resize(data, capacity + (capacity >> 1));
            }
            //数据搬移
            else {
                System.arraycopy(data, head, data, 0, tail - head + 1);
                tail -= head;
                head = 0;
            }
        }

        data[tail++] = value;
        size++;
        return true;
    }

    /**
     * 出队列
     */
    public T dequeue(){
        T result = elementAt(head);

        data[head++] = null;
        size--;

        //缩容
        if (size < (capacity >> 1)){
            resize(data, (capacity >> 1));
        }

        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    @SuppressWarnings("unchecked")
    private T elementAt(int index){
        return (T) data[index];
    }

    /**
     * 扩容和缩容
     */
    private void resize(Object[] data, int newCapacity){
        this.data = Arrays.copyOf(data, newCapacity);
        this.capacity = newCapacity;
    }
}
