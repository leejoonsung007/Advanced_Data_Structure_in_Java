public class PCQ2L {
	
	public static void main(String[] args) {
		// create the stack 
		LinkedStack<Character> stack = new LinkedStack<Character>();
		
		//the initial state
		System.out.println("Stack has been created");
		System.out.println(stack.toString());
		
		//push and pop
		System.out.println("push('e')");
		printPushOpearation(stack, 'e');
		
		System.out.println("push('s')");
		printPushOpearation(stack, 's');

		System.out.println("push('c')");
		printPushOpearation(stack, 'c');

		System.out.println("pop()");
		printPopOpearation(stack);

		System.out.println("push('u')");
		printPushOpearation(stack, 'u');

		System.out.println("push('a')");
		printPushOpearation(stack, 'a');

		System.out.println("pop()");
		printPopOpearation(stack);

		System.out.println("push('o')");
		printPushOpearation(stack, 'o');

		System.out.println("push('t')");
		printPushOpearation(stack, 't');

		System.out.println("pop()");
		printPopOpearation(stack);

		System.out.println("push('t')");
		printPushOpearation(stack, 'h');

	}
			
	public static void printPushOpearation(LinkedStack<Character> stack, char value) {
		stack.push(value);
		System.out.println(stack.toString());
	}
	
	public static void printPopOpearation(LinkedStack<Character>stack) {
		stack.pop();
		System.out.println(stack.toString());
	}
}


