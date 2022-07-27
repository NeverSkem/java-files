package Interface.Set;

public class SetImp implements Set {
	private boolean[] set;

	public SetImp() {
		set = new boolean[MAX];
	}

	public void add(int e) {
		set[e] = true;
	}

	public Set union(Set s) {
		Set result = new SetImp();
		for (int i = 0; i < set.length; i++)
			if (this.set[i] || ((SetImp)s).set[i])
				result.add(i);
		return result;
	}

	public Set intersection(Set s) {
		Set result = new SetImp();
		for (int i = 0; i < set.length; i++)
			if (this.set[i] && ((SetImp)s).set[i])
				result.add(i);
		return result;
	}

	public boolean isDisjoint(Set s) {
		for (int i = 0; i < set.length; i++){
			if (this.set[i] && ((SetImp)s).set[i])
				return false;
			}
		return true;
	}

	public Set difference(Set s) {
		Set result = new SetImp();
		for (int i = 0; i < set.length; i++)
			if (this.set[i] && !((SetImp)s).set[i])
				result.add(i);
		return result;
	}

	public boolean isElementOf(int e) {
		return set[e];
	}

	public int count() {
		int count = 0;
		for (int i = 0; i < set.length; i++)
			if (set[i])
				count++;
				System.out.println(count);
		return count;
	}

	public void display() {
		for (int i = 0; i < set.length; i++){
			if (set[i])
				System.out.print(i + " ");
		}
		System.out.println();
	}
}