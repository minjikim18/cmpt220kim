
public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT = 16;
	
	public StackOfIntegers() {
		this(DEFAULT); // JA
	}
	
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	
	public int pop() {
		return elements[size--];
	}

	public int peek() {
		return elements[size - 1];
		}


	public boolean isempty() {
		return size == 0;
		}

	public int getSize() {
		return size;
	}

	public void push(int i) {
		elements[size++] = i;
	}
}