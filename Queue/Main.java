package Queue;

public class Main {
	public static void main(String[] args) {
		QueueList q1 = new QueueList();
		QueueList q2 = new QueueList();
		q1.enqueue(5);
		q1.enqueue(10);
		q2.enqueue(5);
		q2.enqueue(10);
		q1.enqueue(15);
		q1.enqueue(-20);
		System.out.println(q1);
		q1.enqueue(115);
		q1.enqueue(208);
		System.out.println(q1);
		q1.dequeue();
		System.out.println(q1);
		q1.enqueue(408);
		System.out.println(q1);
		System.out.println(q1.isEqual(q2));
		System.out.println(q1.noNegative());
	}
}
