package datastructure.array;

import java.util.Arrays;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/5 21:18
 * @description 1.数组的插入删除，可直接移动至数组末尾，避免数据搬移
 *               2.标记删除法的基本思想
 */
public class ArrayTips<T> {

    private Object[] data;
    private int capacity;
    private int size;

    public ArrayTips(int capacity) {
        this.data = new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    /**
     * 插入
     */
    public boolean add(int index, T val){
        if (index < 0 || index > size){
            throw new IllegalArgumentException("the index is illegal!");
        }

        if (data[index] != null){
            data[size] = data[index];
        }
        data[index] = val;
        if (++size >= capacity){
            resize(capacity + (capacity >> 1));
        }
        return true;
    }

    /**
     * 删除
     */
    @SuppressWarnings("unchecked")
    public T remove(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("the index is illegal!");
        }

        T res = (T) data[index];
        data[index] = data[size - 1];
        data[--size] = null;

        return res;
    }

    /**
     * 标记删除
     */
    @SuppressWarnings("unchecked")
    public T deleteWithMark(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("the index is illegal!");
        }

        T res = (T) data[index];
        data[index] = null;

        return res;
    }

    /**
     * 标记删除对应的插入
     */
    public boolean addWithMark(T val){
        data[size++] = val;

        //数组末尾没有空间了，触发删除
        if (size == capacity){
            clean();
        }
        //清除之后还是没有空间，则扩容
        if (size == capacity){
            resize(capacity + (capacity >> 1));
        }

        return true;
    }

    /**
     * 当数组空间不够时，再触发真正的删除操作
     */
    public void clean(){
        Object[] temp = new Object[capacity];
        int k = 0;
        for (Object e : data){
            if (e != null){
                temp[k++] = e;
            }
        }
        this.size = k + 1;
        data = temp;
    }

    /**
     * 扩容方法
     */
    private void resize(int newCapacity){
        this.data = Arrays.copyOf(data, newCapacity);
        this.capacity = newCapacity;
    }
}
