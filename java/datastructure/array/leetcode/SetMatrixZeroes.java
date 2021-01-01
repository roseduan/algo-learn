package datastructure.array.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author roseduan
 * @time 2021/1/1 6:39 下午
 * @description 矩阵置零
 */
public class SetMatrixZeroes {

    /**
     * 暴力法，扫描一遍数组，存储值为0的行和列
     * 然后再扫描数组，根据存储的行和列信息将数组置零
     */
    public void setZeroes1(int[][] matrix) {
        Set<Integer> hor = new HashSet<>();
        Set<Integer> ver = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    hor.add(j); ver.add(i);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (hor.contains(j) || ver.contains(i)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes2(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    helper(i, j, matrix);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '*') {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private void helper(int i, int j, int[][] matrix) {
        for (int k = 0; k < matrix.length; k++) {
            if (matrix[k][j] != 0) {
                matrix[k][j] = '*';
            }
        }

        for (int k = 0; k < matrix[i].length; k++) {
            if (matrix[i][k] != 0) {
                matrix[i][k] = '*';
            }
        }
    }
}
