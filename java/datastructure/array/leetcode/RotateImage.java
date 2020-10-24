package datastructure.array.leetcode;

/**
 * @author roseduan
 * 旋转图像(二维矩阵)
 */
public class RotateImage {

    /**
     * 先整体进行反转，再对称交换数组元素
     */
    public void rotate(int[][] matrix) {
        for (int i = 0, j = matrix.length - 1; i < j; i++, j--) {
            int[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int k = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = k;
            }
        }
    }
}
