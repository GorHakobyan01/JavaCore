package homework.homework8;

public class Stack {
	int[] array = new int[10];
	int top;

	Stack() {
		top = -1;
	}

	public void push(int item) {
		if (top == array.length - 1) {
			System.out.println("Stack is full");
		} else {
			array[++top] = item;
		}
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			return array[top--];
		}
	}

	public int gerSize() {
		return top;
	}
}
