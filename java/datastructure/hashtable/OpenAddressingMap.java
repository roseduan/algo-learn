package datastructure.hashtable;

import java.util.ArrayList;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/11/24 9:54
 * @description 哈希表简单实现，使用开放寻址法解决哈希冲突
 */
public class OpenAddressingMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 2.0f/3.0f;

    /**
     * 标记为删除的数组下标集合
     */
    private ArrayList<Integer> markDelete;
    /**
     * 哈希表容量
     */
    private int capacity;
    /**
     * 哈希表中数据个数
     */
    private int size;
    /**
     * 装载因子
     */
    private float loadFactor;
    /**
     * 使用数组存储数据
     */
    private Node<K, V>[] data;

    @SuppressWarnings({"unchecked"})
    public OpenAddressingMap(int capacity, float loadFactor){
        this.data = (Node<K, V>[]) new Node[capacity];
        this.markDelete = new ArrayList<>(capacity);
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.size = 0;
    }

    public OpenAddressingMap(int capacity) {
        this(capacity, DEFAULT_LOAD_FACTOR);
    }

    public OpenAddressingMap(){
        this(DEFAULT_CAPACITY);
    }

    private static class Node<K, V>{
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    /**
     * 查找元素
     */
    public V get(K key){
        int hash = hash(key);

        if (data[hash] == null){
            while (data[hash] != null || markDelete.contains(hash)){
                hash = (hash + 1) % capacity;
            }
        }

        Node<K, V> node = data[hash];
        return node == null ? null : node.value;
    }

    /**
     * 插入元素
     */
    public void put(K key, V value){
        int hash = hash(key);

        Node<K, V> node = new Node<>(key, value);
        //没有冲突
        if (data[hash] != null && data[hash].key.equals(key)){
            data[hash] = node;
            return;
        }
        if (data[hash] == null){
            data[hash] = node;
        }
        //线性探测寻找空闲位置
        else {
            while (data[hash] != null || markDelete.contains(hash)){
                hash = (hash + 1) % capacity;
            }

            data[hash] = node;
        }

        //扩容
        if ((float)(++size / capacity) >= loadFactor){
            resize(capacity + (capacity >> 1));
        }
    }

    /**
     * 删除
     */
    private boolean remove(K key){
        V v = get(key);
        if (v == null){
            return false;
        }

        int hash = hash(key);
        data[hash] = null;
        markDelete.add(hash);

        size--;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");

        if (size != 0){
            for (Node<K, V> node : data){
                if (node != null){
                    sb.append(node.key).append("=").append(node.value).append(", ");
                }
            }
            int len = sb.length();
            sb.delete(len - 2, len);
        }

        return sb.append("}").toString();
    }

    /**
     * 扩容
     */
    private void resize(int newCapacity){
        this.capacity = newCapacity;
        this.loadFactor = (float)(size / newCapacity);
    }

    /**
     * 哈希函数
     */
    private int hash(Object key){
        int h;
        int hash = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        return (this.capacity - 1) & hash;
    }
}
