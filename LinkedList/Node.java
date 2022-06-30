package LinkedList;

public class Node{
	private int item;
	private Node next;

	public Node(){
		this(0,null);
	}

	public Node(int item){
		this.item=item;
		this.next=null;
	}

	public Node(int item, Node next){
		this.item=item;
		this.next=next;
	}

	public void setItem(int item){
		this.item=item;
	}

	public void setNext(Node next){
		this.next=next;
	}

	public int getItem(){
		return item;
	}

	public Node getNext(){
		return next;
	}
}