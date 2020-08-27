package datastructure.heap;

import java.util.Arrays;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/2 21:56
 * @description 堆的基本实现
 */
public class PriorityHeap<T> {

    private static final int DEFAULT_CAPACITY = 16;

    private Object[] data;
    private int size;
    private int capacity;

    public PriorityHeap(int capacity) {
        this.data = new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public PriorityHeap(){
        this(DEFAULT_CAPACITY);
    }

    /**
     * 插入
     */
    @SuppressWarnings("unchecked")
    public boolean add(T val){
        if (val == null){
            throw new NullPointerException();
        }

        Comparable<? super T> key = (Comparable<? super T>) val;
        int i = size;
        while (i > 0){
            int parent = (i - 1) / 2;
            Object e = data[parent];
            if (key.compareTo((T) e) >= 0){
                break;
            }
            data[i] = e;
            i = parent;
        }

        data[i] = key;
        if (++size >= capacity){
            resize(capacity * 2);
        }
        return true;
    }

    /**
     * 删除堆顶元素
     */
    @SuppressWarnings("unchecked")
    public T remove(){
        if (size == 0){
            return null;
        }

        T result = (T) data[0];
        data[0] = null;
        int i = 0;
        int half = --size / 2;

        Comparable<? super T> key = (Comparable<? super T>) data[size];
        data[size] = null;
        while (i < half){
            int child = (2 * i) + 1;
            Object c = data[child];
            int right = child + 1;
            if (right < size && ((Comparable<? super T>) c).compareTo((T) data[right]) > 0){
                c = data[child = right];
            }
            if (key.compareTo((T) c) <= 0){
                break;
            }
            data[i] = c;
            i = child;
        }
        data[i] = key;
        return result;
    }

    /**
     * 扩容函数
     */
    private void resize(int newCapacity){
        this.data = Arrays.copyOf(data, newCapacity);
        this.capacity = newCapacity;
    }

}
