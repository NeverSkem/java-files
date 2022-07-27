package Arrays.DoubleArray.Matrix;

import java.util.*;

public class Matrix {
    private int[][] matrix;

    public Matrix (int row, int col) {
        matrix = new int[row][col];
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    public void display() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix m) {
        Matrix ans = new Matrix(matrix.length, m.matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < m.matrix[i].length; j++) {
                ans.matrix[i][j] += m.matrix[i][j] + matrix[i][j];
            }
        }
        return ans;
    }

    public Matrix subtract(Matrix m) {
        Matrix ans = new Matrix(matrix.length, m.matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < m.matrix[i].length; j++) {
                ans.matrix[i][j] += m.matrix[i][j] - matrix[i][j];
            }
        }
        return ans;
    }

    public Matrix multiply(Matrix m) {
        Matrix ans = new Matrix(matrix.length, m.matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < m.matrix[i].length; j++) {
                ans.matrix[i][j] += m.matrix[i][j] * matrix[i][j];
            }
        }
        return ans;
    }
    public int totalAdd(Matrix m) {
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < m.matrix[i].length; j++) {
                ans += matrix[i][j] + m.matrix[i][j];
            }
        }
        return ans;
    }

    public int totalSubtract(Matrix m) {
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < m.matrix[i].length; j++) {
                ans += matrix[i][j] - m.matrix[i][j];
            }
        }
        return ans;
    }

    public int totalMultiply(Matrix m) {
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < m.matrix[i].length; j++) {
                ans += matrix[i][j] * m.matrix[i][j];
            }
        }
        return ans;
    }
}