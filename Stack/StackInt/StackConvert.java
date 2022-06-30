package Stack.StackInt;

public class StackConvert{
	public void convertDecTo(int dec, int base){
		StackLinkInt st = new StackLinkInt();
		int q = dec, rem;
		while(q!=0){
			rem = q%base;
			st.push(rem);
			q = q/base;
		}
		System.out.println(st);
	}

	public static void main(String[] args){
		StackConvert sc = new StackConvert();
		sc.convertDecTo(1000, 8);
	}
}