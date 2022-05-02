package bracket;

import java.util.Stack;

public class CheckBalancingBrackets {
	Stack<Character> stack=new Stack<Character>();

	public boolean stackImplementation(String string) {

		for(int i=0; i<string.length() ;i++) {
			if (string.charAt(i)=='(' || string.charAt(i)=='[' || string.charAt(i)=='{') {
				stack.push(string.charAt(i));
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}

			char ch;
			switch (string.charAt(i)) {
			case ')':
				ch=stack.pop();
				if (ch=='[' || ch=='{')
					return false;
				break;
			case ']':
				ch=stack.pop();
				if (ch=='(' || ch=='{')
					return false;
				break;
			case '}':
				ch=stack.pop();
				if (ch=='[' || ch=='(')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}
}
