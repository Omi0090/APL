class StackOverflowException extends Exception {
	StackOverflowException() {
		super("Stak Overflow Occurred");
	}
}

class StackUnderflowException extends Exception {
	StackUnderflowException() {
		super("Stak Underflow Occurred");
	}
}

class Stack {
	int top;
	int stack[];
	
	Stack() {
		top = -1;
		stack = new int[5];
	}
	
	public void push(int data) throws StackOverflowException {
		if(top >= stack.length - 1) {
			throw new StackOverflowException();
		}
		else {
			System.out.println(data+" is pushed to stack");
			stack[++top] = data;
		}
	}
	
	public void pop() throws StackUnderflowException {
		if(top == -1) {
			throw new StackUnderflowException();
		}
		else {
			System.out.println(stack[top--]+" is popped from stack");
		}
	}
	
	public void disp() throws StackUnderflowException {
		if(top == -1) {
			throw new StackUnderflowException();
		}
		else {
			for(int i = 0; i < stack.length; i++) {
				System.out.print(stack[i]+" ");
			}
		}
	}
}

class StackException {
	public static void main(String args[]) {
		Stack s = new Stack();
		
		try {
			s.pop();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			s.push(10);
			s.push(20);
			s.push(30);
			s.push(40);
			s.push(50);
			s.push(60);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}