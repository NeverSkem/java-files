package Queue;

public interface MyQueue {
	public void enqueue(int x);
	public void dequeue();
	public int queueFront();
	public boolean isEmpty();
	public void clear();
	public int size();
}