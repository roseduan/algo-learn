package datastructure.tree.leetcode;

/**
 * @author roseduan
 * @time 2020/10/25 11:11 上午
 * @description 实现一个字典树
 */
public class Trie {

    private static final int SIZE = 26;
    private boolean end;
    private final Trie[] children;

    /** Initialize your data structure here. */
    public Trie() {
        this.end = false;
        this.children = new Trie[SIZE];
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie p = this;
        for (char c : word.toCharArray()) {
            if (p.children[c - 'a'] == null) {
                p.children[c - 'a'] = new Trie();
            }
            p = p.children[c - 'a'];
        }
        p.end = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie p = this;
        for (char c : word.toCharArray()) {
            if (p.children[c - 'a'] == null) {
                return false;
            }
            p = p.children[c - 'a'];
        }
        return p.end;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie p = this;
        for (char c : prefix.toCharArray()) {
            if (p.children[c - 'a'] == null) {
                return false;
            }
            p = p.children[c - 'a'];
        }
        return true;
    }
}
