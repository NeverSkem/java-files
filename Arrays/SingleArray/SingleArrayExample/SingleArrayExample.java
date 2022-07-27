package Arrays.SingleArray.SingleArrayExample;

import java.util.*;

public class SingleArrayExample {
	private final int SIZE = 10;
	private int num[];
	private int count;

	public SingleArrayExample(int size) {
		num = new int[size];
		count = 0;
	}

	public SingleArrayExample() {
		num = new int[SIZE];
		count = 0;
	}

	public void input() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < num.length; i++)
			num[i] = input.nextInt();
	}

	public void display() {
		for (int i = 0; i < count; i++)
			System.out.print(num[i] + " ");
		System.out.println();
	}

	public void displayLength() {
		System.out.println(num.length);
	}

	public int computeSum() {
		int sum = 0;
		for (int i = 0; i < count; i++)
			sum += num[i];
		return sum;
	}

	public int countPos() {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 0)
				count++;
		}
		return count;
	}

	public int countNeg() {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0)
				count++;
		}
		return count;
	}

	public int countEven() {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0)
				count++;
		}
		return count;
	}

	public int countOdd() {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0)
				count++;
		}
		return count;
	}

	public boolean findItem(int item) {
		boolean ans = false;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == item) {
				ans = true;
				break;
			}
		}
		return ans;
	}

	public int findItemLoc(int item) {
		int ans = -1;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == item) {
				ans = i;
				break;
			}
		}
		return ans;
	}

	public void add(int item) {
		num[count++] = item;
	}

	public void addFrontV1(int item) {
		for (int i = count; i > 0; i--)
			num[i] = num[i - 1];
		num[0] = item;
		count++;
	}

	public void addFrontV2(int item) {
		for (int i = count - 1; i >= 0; i--)
			num[i + 1] = num[i];
		num[0] = item;
		count++;
	}

	public void addAtV1(int item, int pos) {
		for (int i = count; i > pos; i--)
			num[i] = num[i - 1];
		num[pos] = item;
		count++;
	}

	public void addAtV2(int item, int pos) {
		for (int i = count - 1; i >= pos; i--)
			num[i + 1] = num[i];
		num[pos] = item;
		count++;
	}

	public void delete() {
		count--;
	}

	public void deleteFrontV1() {
		for (int i = 1; i < count; i++)
			num[i - 1] = num[i];
		count--;
	}

	public void deleteFrontV2() {
		for (int i = 0; i < count - 1; i++)
			num[i] = num[i + 1];
		count--;
	}

	public void deleteAtV1(int pos) {
		for (int i = pos + 1; i < count; i++)
			num[i - 1] = num[i];
		count--;
	}

	public void deleteAtV2(int pos) {
		for (int i = pos; i < count - 1; i++)
			num[i] = num[i + 1];
		count--;
	}
}
