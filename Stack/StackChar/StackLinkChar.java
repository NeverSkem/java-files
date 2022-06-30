package Stack.StackChar;

public class StackLinkChar implements StackChar{
	private NodeChar top;

	public StackLinkChar(){
		top=null;
	}

	public void push(char item){
		top = new NodeChar(item,top);
	}

	public void pop(){
		NodeChar temp=top;
		top = top.getNext();
		temp.setNext(null);
	}

	public boolean isEmpty(){
		return top==null;
	}

	public int size(){
		int ctr=0;
		NodeChar ptr=top;
		while(ptr!=null){
			ctr++;
			ptr = ptr.getNext();
		}
		return ctr;
	}

	public char getTop(){
		return top.getItem();
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		NodeChar ptr=top;
		while(ptr!=null){
			sb.append(ptr.getItem() + " ");
			ptr = ptr.getNext();
		}
		return sb.toString();
	}

	public static void main(String[] args){
		StackChar stack1 = new StackLinkChar();
		stack1.push('a');
		stack1.push('b');
		stack1.push('c');
		System.out.println(stack1.toString());
		stack1.pop();
		System.out.println(stack1.toString());
	}
}
