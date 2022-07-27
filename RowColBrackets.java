import java.util.*;

public class RowColBrackets{
	public void getOutput() {
		Scanner input = new Scanner(System.in);
		int row, col = 0;
		System.out.print("Enter the number of rows: ");
		row = input.nextInt();
		while (row >= 1) {
			col = 1;
			while (col <= 10) {
				if (row % 2 == 1) {
					System.out.print("<");
				} else {
					System.out.print(">");
				}
			col++;
			}
		row--;
		System.out.println();
		}
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		RowColBrackets rcb = new RowColBrackets();
		rcb.getOutput();
	}
}