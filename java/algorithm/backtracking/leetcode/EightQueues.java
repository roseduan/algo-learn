package algorithm.backtracking.leetcode;

/**
 * @author roseduan
 * @time 2019/7/23 21:06
 * @description 八皇后问题
 */
public class EightQueues {

    private static final int SIZE = 8;
    private static int[] result = new int[SIZE];

    /**
     * 传入0
     */
    private static void calEightQueues(int row){
        if (row == SIZE){
            printQueues(result);
            return;
        }
        for (int column = 0; column < SIZE; column ++) {
            if (valid(row, column)){
                result[row] = column;
                calEightQueues(row + 1);
            }
        }
    }

    private static boolean valid(int row, int column){
        int left = column - 1;
        int right = column + 1;
        for (int i = row - 1; i >= 0; i --) {
            if (result[i] == column){
                return false;
            }
            if (left >= 0){
                if (result[i] == left){
                    return false;
                }
            }
            if (right < 8){
                if (result[i] == right){
                    return false;
                }
            }
            -- left;
            ++ right;
        }
        return true;
    }

    private static void printQueues(int[] result){
        for (int row = 0; row < SIZE; row ++) {
            for (int column = 0; column < SIZE; column ++) {
                if (result[row] == column){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
