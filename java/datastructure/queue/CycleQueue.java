package datastructure.queue;

import java.util.Arrays;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/10/31 23:31
 * @description 循环队列简单实现
 */
public class CycleQueue<T> {

    private static final int DEFAULT_SIZE = 16;

    private Object[] data;
    private int capacity;
    private int size;
    private int head;
    private int tail;

    public CycleQueue(int capacity) {
        this.data = new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    public CycleQueue(){
        this(DEFAULT_SIZE);
    }

    /**
     * 入队列
     */
    public boolean add(T value) {
        //队列满，需要扩容
        if ((tail + 1) % capacity == head) {
            resize(data, capacity + (capacity >> 1));
        }

        data[tail] = value;
        tail = (tail + 1) % capacity;
        size++;
        return true;
    }

    /**
     * 出队列
     */
    @SuppressWarnings("unchecked")
    public T dequeue(){
        if (head == tail){
            return null;
        }

        T result = (T) data[head];
        data[head] = null;

        head = (head + 1) % capacity;
        size--;

        if (size < (capacity >> 1)){
            resize(data, (capacity >> 1));
            head = 0;
            tail = size - 1;
        }
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    /**
     * 扩容和缩容
     */
    private void resize(Object[] data, int newCapacity){
        Object[] temp = new Object[newCapacity];
        int k = 0;
        while (head != tail){
            temp[k++] = data[head];
            head = (head + 1) % capacity;
        }

        this.data = temp;
        this.capacity = newCapacity;
    }
}
