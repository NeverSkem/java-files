package Stack.StackChar;

public class StackBrackets {
	public boolean popBracket(String str) {
		StackLinkChar st = new StackLinkChar();
		boolean valid = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
				st.push(str.charAt(i));
			} else {
				if (st.isEmpty()) {
					valid = false;
					break;
				}
				else {
					if (str.charAt(i) == ')' && st.getTop() == '(') {
						st.pop();
					} else if (str.charAt(i) == '}' && st.getTop() == '{') {
						st.pop();
					} else if (str.charAt(i) == ']' && st.getTop() == '[') {
						st.pop();
					} else {
						valid = false;
						break;
					}
				}
			}
		}
		return st.isEmpty() && valid == true;
	}

	public static void main(String[] args) {
		StackBrackets sb = new StackBrackets();
		System.out.println(sb.popBracket("((()))"));
		System.out.println(sb.popBracket("{[(}]}"));
		System.out.println(sb.popBracket("[[{)]]"));
		System.out.println(sb.popBracket("({([])})"));
		System.out.println(sb.popBracket("{{[)}}"));
		System.out.println(sb.popBracket("{[([{}])]}"));
	}
}