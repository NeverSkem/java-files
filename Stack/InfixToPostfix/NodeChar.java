package InfixToPostfix;

public class  NodeChar{
	private char item;
	private NodeChar next;

	public NodeChar(char item, NodeChar next){
		this.item = item;
		this.next = next;
	}

	public NodeChar(){}

	public NodeChar(char item){
		this(item, null);
	}

	public void setItem(char item){
		this.item = item;
	}

	public void setNext(NodeChar next){
		this.next = next;
	}

	public char getItem(){
		return item;
	}

	public NodeChar getNext(){
		return next;
	}
}