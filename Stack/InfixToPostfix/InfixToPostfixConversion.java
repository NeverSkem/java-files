package Stack.InfixToPostfix;

public class InfixToPostfixConversion implements StackChar {
	private NodeChar top;

	public InfixToPostfixConversion() {
		top = null;
	}

	public void push(char item) {
		top = new NodeChar(item, top);
	}

	public void pop() {
		NodeChar temp = top;
		top = top.getNext();
		temp.setNext(null);
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int size() {
		int ctr = 0;
		NodeChar ptr = top;
		while (ptr != null) {
			ctr++;
			ptr = ptr.getNext();
		}
		return ctr;
	}

	public char getTop() {
		return top.getItem();
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		NodeChar ptr = top;
		while (ptr != null) {
			sb.append(ptr.getItem() + " ");
			ptr = ptr.getNext();
		}
		return sb.toString();
	}

	public int operator(char op) {
		switch (op) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
		}
		return 0;
	}

	public String infixToPostfix(String infix) {
		StringBuffer sb = new StringBuffer();
		StackChar stack = new InfixToPostfixConversion();
		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				sb.append(ch);
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.isEmpty() && stack.getTop() != '(') {
					sb.append(stack.getTop());
					stack.pop();
				}
				if (!stack.isEmpty() && stack.getTop() == '(') {
					stack.pop();
				}
			} else {
				while (!stack.isEmpty() && stack.getTop() != '(' && stack.operator(stack.getTop()) >= stack.operator(ch)) {
					sb.append(stack.getTop());
					stack.pop();
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.getTop());
			stack.pop();
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		InfixToPostfixConversion ip = new InfixToPostfixConversion();
		System.out.println(ip.infixToPostfix("a+b*c-d"));
		System.out.println(ip.infixToPostfix("2*3-4/5"));
	}
}