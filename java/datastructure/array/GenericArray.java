package datastructure.array;

import java.util.Arrays;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/4 22:52
 * @description 动态数组实现
 */
public class GenericArray<T> {

    private static final int DEFAULT_CAPACITY = 16;

    private Object[] data;
    private int capacity;
    private int size;

    public GenericArray(int capacity) {
        this.data = new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public GenericArray(){
        this(DEFAULT_CAPACITY);
    }

    /**
     * 查找
     */
    @SuppressWarnings("unchecked")
    public T get(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("the index is illegal!");
        }

        return (T) data[index];
    }

    /**
     * 插入到某个位置
     */
    public boolean add(int index, T val){
        if (index < 0 || index > size){
            throw new IllegalArgumentException("the index is illegal!");
        }

        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = val;
        if (++size >= capacity){
            resize(capacity + (capacity >> 1));
        }
        return true;
    }

    /**
     * 插入到末尾
     */
    public boolean add(T val){
        return add(size, val);
    }

    /**
     * 删除
     */
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("the index is illegal!");
        }

        T res = (T) data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;

        return res;
    }

    /**
     * 是否包含
     */
    public boolean contains(T value){
        if (size == 0){
            return false;
        }

        if (value == null){
            for (int i = 0; i < size; i++) {
                if (data[i] == null){
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (value.equals(data[i])){
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        if (size == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++){
            sb.append(data[i]);
            if (data[i + 1] == null){
                sb.append("]");
                break;
            }
            sb.append(",").append(" ");
        }
        return sb.toString();
    }

    /**
     * 扩容方法
     */
    private void resize(int newCapacity){
        this.data = Arrays.copyOf(data, newCapacity);
        this.capacity = newCapacity;
    }
}
