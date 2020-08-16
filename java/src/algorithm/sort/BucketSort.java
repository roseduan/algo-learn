package algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author roseduan
 * @time 2019/1/10 20:11
 * @description 桶排序测试
 */
public class BucketSort {

    /**
     * 测试场景：数组中有10000个数据，范围在(0-100000)
     * 使用100个桶，每个桶存放的数据范围为：0-999, 1000-1999, 2000-2999，依次类推
     */
    public static void bucketSort(int[] data){
        //新建100个桶
        int bucketSize = 100;
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucketSize);
        for (int i = 0; i < bucketSize; i++) {
            buckets.add(new ArrayList<>());
        }
        //遍历数据，将数据放到桶中
        for (int i : data) {
            buckets.get(i / 1000).add(i);
        }
        //在桶内部进行排序
        int k = 0;
        for (int i = 0; i < bucketSize; i++) {
            ArrayList<Integer> list = buckets.get(i);
            Integer[] num = list.toArray(new Integer[1]);
            Arrays.sort(num);
            //拷贝到data中
            for (int n : num) {
                data[k++] = n;
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[10000];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100000);
        }
        BucketSort.bucketSort(data);
        System.out.println(Arrays.toString(data));
    }

}
