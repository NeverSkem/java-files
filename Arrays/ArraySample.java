package Arrays;

import java.util.*;

public class ArraySample{
	private final int SIZE=10;
	private int num[];
	private int count;

	public ArraySample(int size){
		num = new int[size];
		count=0;
	}

	public ArraySample(){
		num = new int[SIZE];
		count=0;
	}

	public void input(){
		Scanner in = new Scanner(System.in);
		for(int i=0;i<num.length;i++)
			num[i]=in.nextInt();
	}

	public void display(){
		for(int i=0;i<count;i++)
			System.out.print(num[i] + " ");
		System.out.println();
	}

	public void displayLength(){
		System.out.println(num.length);
	}

	public int computeSum(){
		int sum=0;
		for(int i=0;i<count;i++)
			sum+=num[i];
		return sum;
	}

	public int countPos(){
		int count=0;
		for(int i=0;i<num.length;i++){
			if(num[i]>=0)
				count++;
		}
		return count;
	}

	public int countNeg(){
		int count=0;
		for(int i=0;i<num.length;i++){
			if(num[i]<0)
				count++;
		}
		return count;
	}

	public int countEven(){
		int count=0;
		for(int i=0;i<num.length;i++){
			if(num[i]%2==0)
				count++;
		}
		return count;
	}

	public int countOdd(){
		int count=0;
		for(int i=0;i<num.length;i++){
			if(num[i]%2!=0)
				count++;
		}
		return count;
	}

	public boolean findItem(int item){
		boolean ans=false;
		for(int i=0;i<num.length;i++){
			if(num[i]==item){
				ans=true;
				break;
			}
		}
		return ans;
	}

	public int findItemLoc(int item){
		int ans = -1;
		for(int i=0;i<num.length;i++){
			if(num[i]==item){
				ans = i;
				break;
			}
		}
		return ans;
	}

	public void add(int item){
		num[count++]=item;
	}

	public void addFrontV1(int item){
		for(int i=count;i>0;i--)
			num[i]=num[i-1];
		num[0]=item;
		count++;
	}

	public void addFrontV2(int item){
		for(int i=count-1;i>=0;i--)
			num[i+1]=num[i];
		num[0]=item;
		count++;
	}

	public void addAtV1(int item, int pos){
		for(int i=count;i>pos;i--)
			num[i]=num[i-1];
		num[pos]=item;
		count++;
	}

	public void addAtV2(int item, int pos){
		for(int i=count-1;i>=pos;i--)
			num[i+1]=num[i];
		num[pos]=item;
		count++;
	}

	public void delete(){
		count--;
	}

	public void deleteFrontV1(){
		for(int i=1;i<count;i++)
			num[i-1]=num[i];
		count--;
	}

	public void deleteFrontV2(){
		for(int i=0;i<count-1;i++)
			num[i]=num[i+1];
		count--;
	}

	public void deleteAtV1(int pos){
		for(int i=pos+1;i<count;i++)
			num[i-1]=num[i];
		count--;
	}

	public void deleteAtV2(int pos){
		for(int i=pos;i<count-1;i++)
			num[i]=num[i+1];
		count--;
	}

	public static void main(String[] args){
		ArraySample array1 = new ArraySample();
		array1.add(5);
		array1.add(10);
		array1.add(15);
		array1.add(20);
		array1.display();
		array1.addFrontV1(-3);
		array1.display();
		array1.addFrontV2(100);
		array1.display();
		array1.delete();
		array1.display();
		array1.deleteFrontV1();
		array1.display();
		array1.deleteFrontV2();
		array1.display();
		array1.addAtV1(75,2);
		array1.display();
		array1.addAtV2(800,3);
		array1.display();
		array1.deleteAtV1(3);
		array1.display();
		array1.deleteAtV2(3);
		array1.display();
	}
}
