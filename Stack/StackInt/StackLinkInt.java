package Stack.StackInt;

public class StackLinkInt implements StackInt{
	private NodeInt top;

	public StackLinkInt(){
		top=null;
	}

	public void push(int item){
		top = new NodeInt(item,top);
	}

	public void pop(){
		NodeInt temp=top;
		top = top.getNext();
		temp.setNext(null);
	}

	public boolean isEmpty(){
		return top==null;
	}

	public int size(){
		int ctr=0;
		NodeInt ptr=top;
		while(ptr!=null){
			ctr++;
			ptr = ptr.getNext();
		}
		return ctr;
	}

	public int getTop(){
		return top.getItem();
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		NodeInt ptr=top;
		while(ptr!=null){
			sb.append(ptr.getItem() + " ");
			ptr = ptr.getNext();
		}
		return sb.toString();
	}

	public int sum(){
		int sum=0;
		NodeInt ptr=top;
		while(ptr!=null){
			sum+=ptr.getItem();
			ptr = ptr.getNext();
		}
		return sum;
	}

	public void appendStack(StackInt s){
		NodeInt ptr=top;
		while(ptr!=null){
			push(ptr.getItem());
			ptr = ptr.getNext();
		}
	}

	public static void main(String[] args){
		StackInt stack1 = new StackLinkInt();
		stack1.push(5);
		stack1.push(10);
		stack1.push(15);
		System.out.println(stack1);
		stack1.pop();
		System.out.println(stack1);
		stack1.push(115);
		System.out.println(stack1);
		stack1.push(153);
		stack1.push(-125);
		System.out.println(stack1);
		System.out.println(stack1.sum());
		
	}
}
