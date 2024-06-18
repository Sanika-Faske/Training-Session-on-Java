package collection.com;

import java.util.Stack;

public class Stack_demo {

	public static void main(String[] args) {
		
		Stack<String> stack= new Stack<>();
		stack.push("lion");
		stack.push("Tiger");
		stack.push("Cat");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}

}
