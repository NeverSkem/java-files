package Queue;

public class QueueList implements MyQueue{
	private Node front;
	private Node rear;

	public QueueList(){}

	public void enqueue(int x){
		Node temp = new Node(x);
		if(isEmpty()==true)
			front=temp;
		else
			rear.setNext(temp);
		rear=temp;
	}

	public void dequeue(){
		Node temp=front;
		if(size()==1){
			front = null;
			rear = null;
		}
		else{
			front=front.getNext();
			temp.setNext(null);
		}
	}

	public int size(){
		int count=0;
		Node ptr=front;
		while(ptr!=null){
			count++;
			ptr=ptr.getNext();
		}
		return count;
	}

	public int queueFront(){
		return front.getItem();
	}
	public boolean isEmpty(){
		return front==null;
	}

	public void clear(){
		Node temp=front;
		Node ptr=front;
		while(ptr!=null){
			ptr=ptr.getNext();
			temp.setNext(null);
			front=ptr;
			temp=ptr;
		}
		rear=null;
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		Node ptr=front;
		while(ptr!=null){
			sb.append(ptr.getItem() + " ");
			ptr=ptr.getNext();
		}
		return sb.toString();
	}

	public boolean isEqual(QueueList q){
		if(size()!=q.size())
			return false;
		Node ptr1=front;
		Node ptr2=q.front;
		while(ptr1!=null){
			if(ptr1.getItem()!=ptr2.getItem())
				return false;
			ptr1=ptr1.getNext();
			ptr2=ptr2.getNext();
		}
		return true;
	}

	public boolean noNegative(){
		Node ptr=front;
		while(ptr!=null){
			if(ptr.getItem()<0)
				return false;
			ptr=ptr.getNext();
		}
		return true;
	}

	public static void main(String[] args){
		QueueList q1 = new QueueList();
		QueueList q2 = new QueueList();
		q1.enqueue(5);
		q1.enqueue(10);
		q2.enqueue(5);
		q2.enqueue(10);
		q1.enqueue(15);
		q1.enqueue(-20);
		System.out.println(q1);
		q1.enqueue(115);
		q1.enqueue(208);
		System.out.println(q1);
		q1.dequeue();
		System.out.println(q1);
		q1.enqueue(408);
		System.out.println(q1);
		System.out.println(q1.isEqual(q2));
		System.out.println(q1.noNegative());
	}
}