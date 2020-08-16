package datastructure.skiplist;

/**
 * @author roseduan[roseduan520@gmail.com]
 * @time 2019/11/21 22:13
 * @description 跳表简单实现
 */
public class SkipList {
    /**
     * 控制随机函数分布
     */
    private static final float LEVEL_RATE = 0.5f;
    /**
     * 最大索引层数
     */
    private static final int MAX_LEVEL = 32;
    /**
     * 当前索引层数
     */
    private int levelCount;
    /**
     * 头节点
     */
    private ListNode head;

    public SkipList(int val) {
        this.levelCount = 1;
        this.head = new ListNode(val);
    }

    /**
     * 节点定义
     */
    private static class ListNode{
        int val;
        int maxLevel;
        ListNode[] forward;

        ListNode(int val, int maxLevel) {
            this.val = val;
            this.maxLevel = maxLevel;
            this.forward = new ListNode[MAX_LEVEL];
        }

        ListNode(int val) {
            this(val, 0);
        }
    }

    /**
     * 查找
     */
    public ListNode find(int value){
        ListNode p = head;
        for (int i = levelCount - 1; i >= 0; i--) {
            while (p.forward[i] != null && p.forward[i].val < value){
                p = p.forward[i];
            }
        }

        while (p != null && p.val != value){
            p = p.forward[0];
        }
        return p;
    }

    /**
     * 插入
     */
    public void add(int value){
        int level = randomLevel();
        ListNode node = new ListNode(value, level);

        ListNode[] update = new ListNode[level];
        for (int i = 0; i < level; i++) {
            update[i] = head;
        }

        ListNode p = head;
        for (int i = level - 1; i >= 0; i--) {
            while (p.forward[i] != null && p.forward[i].val < value){
                p = p.forward[i];
            }
            update[i] = p;
        }

        for (int i = 0; i < level; i++) {
            node.forward[i] = update[i].forward[i];
            update[i].forward[i] = node;
        }

        if (levelCount < level){
            levelCount = level;
        }
    }

    /**
     * 删除
     */
    public void remove(int value){
        ListNode[] update = new ListNode[levelCount];
        ListNode p = head;

        for (int i = levelCount - 1; i >= 0; i--) {
            while (p.forward[i] != null && p.forward[i].val < value){
                p = p.forward[i];
            }
            update[i] = p;
        }

        for (int i = levelCount - 1; i >= 0; i--) {
            while (update[i].forward[i] != null && update[i].forward[i].val != value){
                update[i] = update[i].forward[i];
            }
            if (update[i].forward[i] != null){
                update[i].forward[i] = update[i].forward[i].forward[i];
            }
        }

        while (levelCount > 1 && head.forward[levelCount] == null){
            levelCount--;
        }
    }

    /**
     * 随机函数
     */
    private int randomLevel(){
        int level = 1;
        while (Math.random() < LEVEL_RATE && level < MAX_LEVEL){
            level += 1;
        }

        return level;
    }
}