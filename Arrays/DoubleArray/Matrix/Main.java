package Arrays.DoubleArray.Matrix;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrix mat1 = new Matrix(0, 0);
        Matrix mat2 = new Matrix(0, 0);

        System.out.print("Input the rows of the first matrix: ");
        int row1 = input.nextInt();
        System.out.print("Input the columns of the first matrix: ");
        int col1 = input.nextInt();
        mat1 = new Matrix(row1, col1);

        System.out.print("\nInput the rows of the second matrix: ");
        int row2 = input.nextInt();
        System.out.print("Input the columns of the second matrix: ");
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
