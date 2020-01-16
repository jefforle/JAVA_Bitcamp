package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackTest {
	public static void main(String[] args) {
		String[] groupA = {"우즈벡", "사우디", "스페인", "대한민국"};
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length; i++)
				stack.push(groupA[i]); //집어넣어라
		
		while(! stack.isEmpty())
			out.println(stack.pop());
		
	}

}
