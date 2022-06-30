package Stack.StackInt;

public class  NodeInt{
	private int item;
	private NodeInt next;

	public NodeInt(int item, NodeInt next){
		this.item = item;
		this.next = next;
	}

	public NodeInt(){
		this(0,null);
	}

	public NodeInt(int item){
		this(item, null);
	}

	public void setItem(int item){
		this.item = item;
	}

	public void setNext(NodeInt next){
		this.next = next;
	}

	public int getItem(){
		return item;
	}

	public NodeInt getNext(){
		return next;
	}
}