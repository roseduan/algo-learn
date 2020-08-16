package datastructure.tree;

/**
 * @author roseduan
 * @time 2019/7/1 10:09
 * @description 字典树的实现
 */
public class Trie {

    /**
     * 根节点不存储数据
     */
    private TrieNode root = new TrieNode('/');

    /**
     * 插入字符串
     */
    public void insert(char[] value){
        TrieNode p = root;
        for (char c : value) {
            int index = c - 'a';

            if (p.children[index] == null){
                TrieNode node = new TrieNode(c);
                p.children[index] = node;
            }
            p = p.children[index];
        }
        p.isEndingChar = true;
    }

    /**
     * 查找一个字符串
     */
    public boolean find(char[] value){
        TrieNode p = root;
        for (char c : value){
            int index = c - 'a';
            if (p.children[index] == null) {
                //未找到匹配的字符串
                return false;
            }
            p = p.children[index];
        }
        return p.isEndingChar;
    }

    /**
     * Trie树节点定义
     */
    public static class TrieNode{
        char data;
        /**
         * 假设字典树中只存储a-z这26个字母
         */
        TrieNode[] children = new TrieNode[26];
        boolean isEndingChar = false;

        TrieNode(char data) {
            this.data = data;
        }
    }

}
