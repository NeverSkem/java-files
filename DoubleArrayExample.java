import java.util.*;

public class DoubleArrayExample{
	private int[][] darray;
	private int row=3;
	private int col=4;

	public DoubleArrayExample(){
		darray = new int[row][col];
	}

	public DoubleArrayExample(int row1, int col1){
		row = row1;
		col = col1;
		darray = new int[row][col];
	}

	public void input(){
		Scanner in = new Scanner(System.in);
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++)
				darray[i][j] = in.nextInt();
		}
	}

	public void display(){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++)
				System.out.print(darray[i][j] + "\t");
			System.out.println();
		}
	}

	public int computeSum(){
		int sum=0,sumperrow;
		for(int i=0;i<row;i++){
			sumperrow=0;
			for(int j=0;j<col;j++){
				sum+=darray[i][j];
				sumperrow+=darray[i][j];
			}
			System.out.println(sumperrow);
		}
		return sum;
	}

	public void pattern1(){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i==j)
					darray[i][j]=0;
				else
					darray[i][j]=1;
			}
		}

	}

	public void pattern2(){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i==j)
					darray[i][j]=0;
				else if(i>j)
					darray[i][j]=1;
				else
					darray[i][j]=-1;
			}
		}
	}

	public void multiplicationTable(){
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		DoubleArrayExample da = new DoubleArrayExample(3,3);
		da.multiplicationTable();
	}
}