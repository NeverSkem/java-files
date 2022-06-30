import java.util.*;

public class RowColBrackets{
	Scanner input = new Scanner(System.in);
	public int row, col = 0;

	public void getInput(){
		System.out.print("Enter the number of rows: ");
		row = input.nextInt();
	}

	public void getOutput(){
		while(row>=1){
			col = 1;
			while (col<=10){
				if(row%2==1){
					System.out.print("<");
				}
				else{
					System.out.print(">");
				}
			col++;
			}
		row--;
		System.out.println();
		}
	}

	public static void main(String[] args){
		RowColBrackets out = new RowColBrackets();
		out.getInput();
		out.getOutput();
	}
}

