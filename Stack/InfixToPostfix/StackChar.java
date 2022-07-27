package Stack.InfixToPostfix;

public interface StackChar {
	public void push(char item);
	public void pop();
	public boolean isEmpty();
	public int size();
	public char getTop();
	public int operator(char op);
}