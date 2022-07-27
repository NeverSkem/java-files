package LinkedList;

public class Main {
    public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.addFront(5);
		list.addFront(10);
		list.addFront(15);
		list.addEnd(20);
		list.addEnd(30);
		list.addAt(-7,6);
		list.deleteFront();
		list.deleteEnd();
		list.deleteAt(3);
		list.display();

		System.out.println("Smallest: " + list.findMin());
		System.out.println("Largest: " + list.findMax());
		System.out.println("Total: " + list.getSum());
		System.out.println("Positives: " + list.countPos());
		System.out.println("Negatives: " + list.countNeg());
		System.out.println("Even: " + list.countEven());
		System.out.println("Odd: " + list.countOdd());
		System.out.println("Contains: " + list.containsAt(5));
		System.out.println("At: " + list.containsAt(5));
	}
}
