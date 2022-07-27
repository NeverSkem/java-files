package Arrays.SingleArray.SingleArrayExample;

public class Main {
	public static void main(String[] args) {
		SingleArrayExample arr1 = new SingleArrayExample();
		arr1.add(5);
		arr1.add(-6);
		arr1.add(7);
		arr1.add(8);
		arr1.add(9);
		arr1.add(-10);
		arr1.display();
		arr1.addFrontV1(-1);
		arr1.addAtV1(2, 1);
		arr1.addAtV2(-3, 2);
		arr1.addAtV2(4, 3);
		arr1.display();
		arr1.displayLength();
		System.out.println(arr1.computeSum());
		System.out.println(arr1.countPos());
		System.out.println(arr1.countNeg());
		System.out.println(arr1.findItemLoc(-3));
	}
}
