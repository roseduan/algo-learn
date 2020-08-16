package datastructure.array;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/12/7 9:51
 * @description 使用数组实现的LRU缓存算法
 */
public class LruBasedArray<T> {

    private static final int DEFAULT_CAPACITY = 16;

    private Object[] data;
    private int capacity;
    private int size;

    public LruBasedArray(int capacity) {
        this.data = new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public LruBasedArray() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 添加缓存
     */
    public boolean add(T val){
        if (size == capacity){
            throw new IllegalArgumentException("cache is full");
        }

        int index = this.find(val);
        if (index != -1) {
           this.delete(index);
        }
        data[size++] = val;
        return true;
    }

    /**
     * 查询缓存
     */
    public T find(int index){
        if (size == 0){
            throw new IllegalArgumentException("cache is null");
        }
        checkIndex(index);

        T res = elementAt(index);
        this.delete(index);
        data[size++] = res;
        return res;
    }

    /**
     * 查找最新缓存
     */
    public T findLatest(){
        if (size == 0){
            throw new IllegalArgumentException("cache is null");
        }
        return elementAt(size - 1);
    }

    /**
     * 删除缓存
     */
    public T remove(int index){
        if (size == 0){
            throw new IllegalArgumentException("cache is null");
        }
        checkIndex(index);
        return this.delete(index);
    }

    @Override
    public String toString() {
        if (size == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++){
            sb.append(data[i]);
            if (i == size - 1 || data[i + 1] == null){
                sb.append("]");
                break;
            }
            sb.append(",").append(" ");
        }
        return sb.toString();
    }

    /**
     * 查找元素
     */
    private int find(T val){
        if (size == 0){
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (data[i].equals(val)){
                return i;
            }
        }

        return -1;
    }

    /**
     * 删除某位置的元素
     */

    private T delete(int index){
        checkIndex(index);
        T res = elementAt(index);
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        --size;
        return res;
    }

    private void checkIndex(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("index is illegal");
        }
    }

    @SuppressWarnings("unchecked")
    private T elementAt(int index){
        return (T) data[index];
    }
}
