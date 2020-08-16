package datastructure.hashtable;

import java.util.Arrays;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/11/24 12:24
 * @description 哈希表简单实现，使用链表解决哈希冲突
 */
public class LinkedMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

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
     * 数组存储节点数据
     */
    private Node<K, V>[] data;

    @SuppressWarnings({"unchecked"})
    public LinkedMap(int capacity, float loadFactor) {
        this.capacity = capacity;
        this.size = 0;
        this.loadFactor = loadFactor;
        this.data = (Node<K, V>[]) new Node[capacity];
    }

    public LinkedMap(int capacity){
        this(capacity, DEFAULT_LOAD_FACTOR);
    }

    public LinkedMap(){
        this(DEFAULT_CAPACITY);
    }

    private static class Node<K, V>{
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    /**
     * 查找
     */
    public V get(K key){
        int hash = hash(key);
        Node<K, V> node = data[hash];

        while (node != null && !node.key.equals(key)){
            node = node.next;
        }
        return node == null ? null : node.value;
    }

    /**
     * 插入
     */
    public void put(K key, V value) {
        Node<K, V> node = new Node<>(key, value);

        int hash = hash(key);

        if (data[hash] == null) {
            data[hash] = node;
        }
        else {
            while (data[hash].next != null && !data[hash].key.equals(key)){
                data[hash] = data[hash].next;
            }
            if (data[hash].key.equals(key)){
                data[hash].value = value;
                return;
            }
            else {
                data[hash].next = node;
            }
        }
        if (((float)++size / capacity) >= loadFactor){
            resize(capacity + (capacity << 1));
        }
    }

    /**
     * 删除
     */
    public boolean remove(K key){
        //先查找
        int hash = hash(key);
        Node<K, V> node = data[hash];
        Node<K, V> prev = null;

        while (node != null && !node.key.equals(key)){
            prev = node;
            node = node.next;
        }

        //未找到
        if (node == null){
            return false;
        }
        //如果删除的是头节点
        if (prev == null){
            data[hash] = node.next;
        }
        else {
            prev.next = prev.next.next;
        }

        size--;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");

        if (size != 0){
            for (Node<K, V> node : data){
                while (node != null){
                    sb.append(node.key).append("=").append(node.value).append(", ");
                    node = node.next;
                }
            }
            int len = sb.length();
            sb.delete(len - 2, len);
        }

        return sb.append("}").toString();
    }

    /**
     * 扩容方法
     */
    private void resize(int newCapacity){
        this.data = Arrays.copyOf(data, newCapacity);
        this.capacity = newCapacity;
        this.loadFactor = (float) size / newCapacity;
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