package Stack.PostfixEvaluation;

public class PostfixEvaluation implements Stack {
	private Node top;

	public PostfixEvaluation() {
		top = null;
	}

	public void push(int item){
		top = new Node(item, top);
	}

	public void pop() {
		Node temp = top;
		top = top.getNext();
		temp.setNext(null);
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int size() {
		int ctr = 0;
		Node ptr = top;
		while (ptr != null) {
			ctr++;
			ptr = ptr.getNext();
		}
		return ctr;
	}

	public int getTop() {
		return top.getItem();
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node ptr = top;
		while (ptr != null) {
			sb.append(ptr.getItem() + " ");
			ptr = ptr.getNext();
		}
		return sb.toString();
	}

	public int evaluatePostfix(String postfix) {
		Stack stack = new PostfixEvaluation();
		int i = 0, res = 0;
		while (i < postfix.length()) {
			if (!Character.isDigit(postfix.charAt(i))) {
				int op1 = stack.getTop();
				stack.pop();
				int op2 = stack.getTop();
				stack.pop();
				switch (postfix.charAt(i)) {
					case '+':
						res = op1 + op2;
						break;
					case '-':
						res = op2 - op1;
						break;
					case '*':
						res = op1 * op2;
						break;
					case '/':
						res = op2 / op1;
					break;
				}
				stack.push(res);
			} else{
				stack.push(postfix.charAt(i) - '0');
			}
			i++;
		}
		return stack.getTop();
	}

	public static void main(String[] args) {
		PostfixEvaluation pe = new PostfixEvaluation();
		System.out.println(pe.evaluatePostfix("123*+4-"));
	}
}