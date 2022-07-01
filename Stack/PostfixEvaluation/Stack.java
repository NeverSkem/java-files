package Stack.PostfixEvaluation;

public interface Stack{
	public void push(int item);
	public void pop();
	public boolean isEmpty();
	public int size();
	public int getTop();
}