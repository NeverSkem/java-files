package Arrays.DoubleArray.DoubleArrayExample;

import java.util.*;

public class DoubleArrayExample {
	private int[][] darr;
	private int row = 2;
	private int col = 3;

	public DoubleArrayExample() {
		darr = new int[row][col];
	}

	public DoubleArrayExample(int row1, int col1) {
		row = row1;
		col = col1;
		darr = new int[row][col];
	}

	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Row: " + row + ", Column: " + col);
		for (int i = 0; i < row; i++) {
			System.out.print("Input the elements of row " + (i + 1) + ": ");
			for (int j = 0; j < col; j++)
				darr[i][j] = input.nextInt();
		}
	}

	public void display() {
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++)
				System.out.print(darr[i][j] + "\t");
			System.out.println();
		}
	}

	public int computeSum() {
		int sum = 0, sumperrow;
		for (int i = 0; i < row; i++) {
			sumperrow = 0;
			for (int j = 0; j < col; j++) {
				sum += darr[i][j];
				sumperrow += darr[i][j];
			}
			System.out.println(sumperrow);
		}
		return sum;
	}

	public void pattern1() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j)
					darr[i][j] = 0;
				else
					darr[i][j] = 1;
			}
		}

	}

	public void pattern2() {
		for (int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if (i == j)
					darr[i][j] = 0;
				else if (i > j)
					darr[i][j] = 1;
				else
					darr[i][j] = -1;
			}
		}
	}

	public void multiplicationTable() {
		for (int i = 1; i <= col; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}
}