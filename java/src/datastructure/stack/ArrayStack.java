package datastructure.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/10/27 15:13
 * @description 使用数组实现简单的栈
 */
public class ArrayStack<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] data;
    private int capacity;
    private int size;

    public ArrayStack(int capacity) {
        this.data = new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    /**
     * 入栈
     */
    public void push(T value){
        //扩容
        if (size >= capacity){
            resize(data, capacity + (capacity >> 1));
        }

        data[size++] = value;
    }

    /**
     * 出栈
     */
    public T pop(){
        if (size == 0){
            throw new EmptyStackException();
        }
        T result = elementAt(size - 1);
        data[--size] = null;

        //缩容
        if (size < capacity / 2){
            resize(data, capacity >> 1);
        }

        return result;
    }

    /**
     * 获取栈顶元素
     */
    public T peek(){
        if (size == 0){
            throw new EmptyStackException();
        }
        return elementAt(size - 1);
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    @SuppressWarnings("unchecked")
    private T elementAt(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("index " + index + " is illegal");
        }

        return (T) data[index];
    }

    /**
     * 重新设置data，用于扩容和缩容
     */
    private void resize(Object[] data, int newCapacity) {
        this.data = Arrays.copyOf(data, newCapacity);
        this.capacity = newCapacity;
    }

}
