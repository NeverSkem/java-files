package Interface.Set;

public interface Set {
	public static final int MAX = 10;
	public void add(int e);
	public Set union(Set s);
	public Set intersection(Set s);
	public boolean isDisjoint(Set s);
	public Set difference(Set s);
	public boolean isElementOf(int e);
	public int count();
	public void display();
}