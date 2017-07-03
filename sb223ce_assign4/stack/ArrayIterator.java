package sb223ce_assign4.stack;

public class ArrayIterator {
	
	/* Field variables */
	
	private int nextElement = 0;
	private Object[] elements;
	private final int max;

	
	/* Constructor with parameters*/
	
	public ArrayIterator(Object[] arr, int maxIndex) {
		elements = arr;
		max = maxIndex;
	}

	
	public boolean hasNext() {
		return nextElement < max;  // return if maxIndex of array is greater than zero
	}

	
	public Object next() {
		return elements[nextElement++];  // return element at certain position
	}

}
