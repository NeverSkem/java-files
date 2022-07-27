package Arrays.DoubleArray;

import java.util.*;

public class PascalsTriangle {
    public int[][] pascalsTriangle(int n) {
        int[][] pt = new int[n][];
        for(int i = 0; i < n; i++) {
            pt[i] = new int[i + 1];
            pt[i][0] = 1;
            for(int j = 1; j < i; j++) {
                pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];
            }
            pt[i][i] = 1;
        }
        return pt;
    }

    public void display(int[][] pt) {
        for(int i = 0; i < pt.length; i++) {
            for(int j = 0; j < pt[i].length; j++) {
                System.out.print(pt[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PascalsTriangle pt = new PascalsTriangle();
        System.out.print("Enter the number of rows: ");
        int size = input.nextInt();
        pt.display(pt.pascalsTriangle(size));
    }
}