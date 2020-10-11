package datastructure.queue.leetcode;

/**
 * @author roseduan
 * @time 2020/9/13 2:30 下午
 * @description 设计循环双端队列
 */
class MyCircularDeque {

    private int[] data;
    private int size;
    private int head;
    private int tail;

    public MyCircularDeque(int k) {
        this.data = new int[k];
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    public boolean insertFront(int value) {
        if (size >= data.length) {
            return false;
        }

        if (size != 0) {
            head = head == 0 ? data.length - 1 : head - 1;
        }

        data[head] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (size >= data.length) {
            return false;
        }

        if (size == 0) {
            return insertFront(value);
        }
        tail = (tail + 1) % data.length;
        data[tail] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0) {
            return false;
        }

        if (size != 1) {
            head = (head + 1) % data.length;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size == 0) {
            return false;
        }

        if (size != 1) {
            tail = (tail == 0) ? data.length - 1 : tail - 1;
        }
        size--;
        return true;
    }

    public int getFront() {
        return size == 0 ? -1 : data[head];
    }

    public int getRear() {
        return size == 0 ? -1 : data[tail];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return size == this.data.length;
    }
}
