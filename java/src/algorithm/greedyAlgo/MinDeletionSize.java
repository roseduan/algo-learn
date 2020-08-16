package algorithm.greedyAlgo;

/**
 * @author roseduan
 * @time 2019/8/11 10:18
 * @description 删序造列
 */
public class MinDeletionSize {

    private static int getCount(String[] str){
        int count = 0;

        for (int i = 0; i < str[0].length(); i++) {
            for (int j = 0; j < str.length - 1; j++) {
                if (str[j].charAt(i) > str[j + 1].charAt(i)){
                    count ++;
                    break;
                }
            }
        }
        return count;
    }

}
