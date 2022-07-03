package Arrays;

import java.util.*;

public class Matrix {
    private int[][] matrix;

    public Matrix (int row, int col) {
        matrix = new int[row][col];
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    public void display(){
        for(int i=0; i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix m) {
        Matrix ans = new Matrix(matrix.length,m.matrix[0].length);
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<m.matrix[i].length;j++) {
                ans.matrix[i][j] += m.matrix[i][j] + matrix[i][j];
            }
        }
        return ans;
    }

    public Matrix subtract(Matrix m){
        Matrix ans = new Matrix(matrix.length,m.matrix[0].length);
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<m.matrix[i].length;j++) {
                ans.matrix[i][j] += m.matrix[i][j] - matrix[i][j];
            }
        }
        return ans;
    }

    public Matrix multiply(Matrix m){
        Matrix ans = new Matrix(matrix.length,m.matrix[0].length);
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<m.matrix[i].length;j++) {
                ans.matrix[i][j] += m.matrix[i][j] * matrix[i][j];
            }
        }
        return ans;
    }

    public int totalAdd(Matrix m){
        int ans = 0;
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<m.matrix[i].length;j++) {
                ans += matrix[i][j] + m.matrix[i][j];
            }
        }
        return ans;
    }

    public int totalSubtract(Matrix m){
        int ans = 0;
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<m.matrix[i].length;j++) {
                ans += matrix[i][j] - m.matrix[i][j];
            }
        }
        return ans;
    }

    public int totalMultiply(Matrix m){
        int ans = 0;
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<m.matrix[i].length;j++) {
                ans += matrix[i][j] * m.matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Matrix mat1 = new Matrix(0, 0);
        Matrix mat2 = new Matrix(0, 0);
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of rows and columns of the first matrix: ");
        int row1 = input.nextInt();
        int col1 = input.nextInt();
        mat1 = new Matrix(row1, col1);
        System.out.println("\nInput the number of rows and columns of the second matrix: ");
        int row2 = input.nextInt();
        int col2 = input.nextInt();
        mat2 = new Matrix(row2, col2);
        System.out.println("\nInitialize Matrix 1");
        mat1.initialize();
        System.out.println("\nInitialize Matrix 2");
        mat2.initialize();
        System.out.println("\nSum of matrices");
        mat1.add(mat2).display();
        System.out.println("Total: " + mat1.totalAdd(mat2));
        System.out.println("\nDifference of matrices");
        mat2.subtract(mat1).display();
        System.out.println("Total: " + Math.abs(mat1.totalSubtract(mat2)));
        System.out.println("\nProduct of matrices");
        mat1.multiply(mat2).display();
        System.out.println("Total: " + mat1.totalMultiply(mat2));
    }
}