package LinkedList;

import java.util.*;

public class LinkedList{
	private Node head;

	public LinkedList(){
		head=null;
	}

	public void create(){
		Scanner input = new Scanner(System.in);
		Node ptr;
		head = new Node(input.nextInt());
		ptr=head;
		for(int i=2;i<=10;i++){
			ptr.setNext(new Node(input.nextInt()));
			ptr=ptr.getNext();
		}
	}

	public void display(){
		Node ptr=head;
		while(ptr!=null){
			System.out.print(ptr.getItem() + " ");
			ptr=ptr.getNext();
		}
		System.out.println();
	}

	public int getSum(){
		int sum=0;
		Node ptr=head;
		while(ptr!=null){
			sum+=ptr.getItem();
			ptr=ptr.getNext();
		}
		return sum;
	}

	public int count(){
		int ctr=0;
		Node ptr=head;
		while(ptr!=null){
			ctr++;
			ptr=ptr.getNext();
		}
		return ctr;
	}

	public int countPos(){
		int ctr=0;
		Node ptr=head;
		while(ptr!=null){
			if(ptr.getItem()>=0)
				ctr++;
			ptr=ptr.getNext();
		}
		return ctr;
	}

	public int countNeg(){
		int ctr=0;
		Node ptr=head;
		while(ptr!=null){
			if(ptr.getItem()<0)
				ctr++;
			ptr=ptr.getNext();
		}
		return ctr;
	}

	public int countOdd(){
		int ctr=0;
		Node ptr=head;
		while(ptr!=null){
			if(ptr.getItem()%2!=0)
				ctr++;
			ptr=ptr.getNext();
		}
		return ctr;
	}

	public int countEven(){
		int ctr=0;
		Node ptr=head;
		while(ptr!=null){
			if(ptr.getItem()%2==0)
				ctr++;
			ptr=ptr.getNext();
		}
		return ctr;
	}

	public boolean contains(int data){
		boolean ans=false;
		Node ptr=head;
		while(ptr!=null){
			if(ptr.getItem()==data){
				ans=true;
				break;
			}
			ptr=ptr.getNext();
		}
		return ans;
	}

	public int containsAt(int data){
		int ans=0,ctr;
		Node ptr=head;
		ctr=1;
		while(ptr!=null){
			if(ptr.getItem()==data){
				ans=ctr;
				break;
			}
			ptr=ptr.getNext();
			ctr++;
		}
		return ans;
	}

	public int findMin(){
		Node ptr;
		int min=head.getItem();
		ptr=head.getNext();
		while(ptr!=null){
			if(ptr.getItem()<min)
				min=ptr.getItem();
			ptr=ptr.getNext();
		}
		return min;
	}

	public int findMax(){
		Node ptr;
		int max=head.getItem();
		ptr=head.getNext();
		while(ptr!=null){
			if(ptr.getItem()>max)
				max=ptr.getItem();
			ptr=ptr.getNext();
		}
		return max;
	}

	public boolean isEmpty(){
		return head==null;
	}

	public void addFront(int data){
		Node temp= new Node(data,head);
		head=temp;
	}

	public void addEnd(int data){
		Node temp = new Node(data);
		Node ptr=head;
		while(ptr.getNext()!=null)
			ptr=ptr.getNext();
		ptr.setNext(temp);
	}

	public void addAt(int data,int pos){
		Node temp = new Node(data);
		if(pos==1){
			temp.setNext(head);
			head=temp;
		}
		else{
			Node ptr=head;
			int node=1;
			while(node<pos-1){
				ptr=ptr.getNext();
				node++;
			}
			temp.setNext(ptr.getNext());
			ptr.setNext(temp);
		}
	}

	public void deleteFront(){
		Node temp=head;
		head=head.getNext();
		temp.setNext(null);
	}

	public void deleteEnd(){
		Node temp=head;
		Node ptr=head;
		while(ptr.getNext()!=null){
			temp=ptr;
			ptr=ptr.getNext();
		}
		temp.setNext(null);
	}

	public void deleteAt(int pos){
		if(pos==1){
			deleteFront();
		}
		else{
			Node ptr=head;
			int node=1;
			while(node<pos-1){
				ptr=ptr.getNext();
				node++;
			}
			Node temp=ptr.getNext();
			ptr.setNext(temp.getNext());
			temp.setNext(null);
		}
	}

	public int getAt(int pos){
		Node ptr=head;
		int node=1;
		while(node<pos){
			ptr=ptr.getNext();
			node++;
		}
		return ptr.getItem();
	}

	public int getItemPos(int elem){
		int pos=0;
		Node ptr=head;
		while(ptr!=null){
			pos++;
			if(ptr.getItem()==elem)
				break;
			ptr=ptr.getNext();
		}
		return pos;
	}

	public static void main(String[] args){
		LinkedList list = new LinkedList();

		list.addFront(5);
		list.addFront(10);
		list.addFront(15);
		list.display();
		list.addEnd(20);
		list.addEnd(30);
		list.display();
		list.addAt(-7,6);
		list.display();
		list.deleteFront();
		list.display();
		list.deleteEnd();
		list.display();
		list.deleteAt(3);
		list.display();

		// list.create();
		// System.out.println("Smallest: " + list.findMin());
		// System.out.println("Largest: " + list.findMax());
		// System.out.println("Total: " + list.getSum());
		// System.out.println("Positives: " + list.countPos());
		// System.out.println("Negatives: " + list.countNeg());
		// System.out.println("Even: " + list.countEven());
		// System.out.println("Odd: " + list.countOdd());
		// System.out.println("Contains: " + list.contains(5));
		// System.out.println("At: " + list.containsAt(5));
	}
}
