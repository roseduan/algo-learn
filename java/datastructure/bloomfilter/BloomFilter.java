package datastructure.bloomfilter;

import java.util.BitSet;

/**
 * @author roseduan
 * @time 2020/11/8 9:11 上午
 * @description 布隆过滤器
 */
public class BloomFilter {

    public static void main(String[] args) {
        final BitSet set = BitSet.valueOf("I am roseduan".getBytes());
        System.out.println(set.get(3));
    }

    private BitSet bitSet;

}
