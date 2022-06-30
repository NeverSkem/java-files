package Stack.StackInt;

public interface StackInt{
	public void push(int item);
	public void pop();
	public boolean isEmpty();
	public int size();
	public int getTop();
	public int sum();
	public void appendStack(StackInt s);
}