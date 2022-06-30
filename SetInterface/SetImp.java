package Interface;

public class SetImp implements Set{
	private boolean[] set;

	public SetImp(){
		set = new boolean[MAX];
	}

	public void add(int e){
		set[e]=true;
	}

	public Set union(Set s){
		Set result = new SetImp();
		for(int i=0;i<set.length;i++)
			if(this.set[i] || ((SetImp)s).set[i])
				result.add(i);
		return result;
	}

	public Set intersection(Set s){
		Set result = new SetImp();
		for(int i=0;i<set.length;i++)
			if(this.set[i] && ((SetImp)s).set[i])
				result.add(i);
		return result;
	}

	public boolean isDisjoint(Set s){
		for(int i=0;i<set.length;i++){
			if (this.set[i] && ((SetImp)s).set[i])
				return false;
			}
		return true;
	}

	public Set difference(Set s){
		Set result = new SetImp();
		for(int i=0;i<set.length;i++)
			if(this.set[i] && !((SetImp)s).set[i])
				result.add(i);
		return result;
	}

	public boolean isElementOf(int e){
		return set[e];
	}

	public int count(){
		int count = 0;
		for(int i=0;i<set.length;i++)
			if(set[i])
				count++;
				System.out.println(count);
		return count;
	}

	public void display(){
		for(int i=0;i<set.length;i++){
			if(set[i])
				System.out.print(i + " ");
		}
		System.out.println();
	}

public static void main(String[] args){
	Set setA = new SetImp();
	Set setB = new SetImp();
	Set universalSet;
	setA.add(1);
	setA.add(3);
	setA.add(5);
	System.out.print("A: ");
	setA.display();
	System.out.print("n(A): ");
	setA.count();
	int isElementA = 3;
	System.out.println("\nIs" + isElementA + "an element of Set A? ");
	boolean elementsSetA = setA.isElementOf(isElementA);
		if (elementsSetA)
			System.out.println("Yes");
		else
			System.out.println("No");
	setB.add(0);
	setB.add(3);
	setB.add(5);
	setB.add(7);
	System.out.print("B: ");
	setB.display();
	System.out.print("n(B): ");
	setB.count();
	int isElementB = 9;
	System.out.println("\nIs" + isElementB + "an element of Set A? ");
	boolean elementsSetB = setB.isElementOf(isElementB);
		if (elementsSetB)
			System.out.println("Yes");
		else
			System.out.println("No");
	universalSet = setA.union(setB);
	System.out.print("A u B: ");
	universalSet.display();
	universalSet = setA.intersection(setB);
	System.out.print("A n B: ");
	universalSet.display();
	System.out.print("A and B are disjoint sets? -");
	boolean areDisjoint = setA.isDisjoint(setB);
		if (areDisjoint)
			System.out.println("Yes");
		else
			System.out.println("No");
	universalSet = setA.difference(setB);
	System.out.print("A - B: ");
	universalSet.display();
	universalSet = setB.difference(setA);
	System.out.print("B - A: ");
	universalSet.display();
	}
}