package sb223ce_assign4.stack;

import java.util.Iterator;

public class StackClass implements Stack {

	// fields
	private int size = 0;
	private Object[] list = new Object[8]; 
	private Object obj;

	public StackClass() {

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void push(Object element) {
		if (size == list.length) {
			resize();
		}
		list[size++] = element;
	}

	@Override
	public Object pop() {
		if (isEmpty() == false) { // check if stack is not empty
			obj = list[size - 1]; // take the last input element
			Object[] temp = new Object[size - 1]; // create a new array
			for (int i = 0; i <= size() - 2; i++) { // run the loop, but do not
													// save the last element in
													// the array
				temp[i] = list[i];
			}
			list = temp; // new array that does not contains the top element
			size = size - 1; // as we deleted one element, so decrease the size
			return obj; // return the element
		} else
			throw new IndexOutOfBoundsException("Stack is Empty"); // throw
																	// error if
																	// stack is
																	// empty
	}

	@Override
	public Object peek() {
		if (isEmpty() == false) { // check if stack is not empty
			return list[size - 1]; // return the top position
		} else
			throw new IndexOutOfBoundsException("Stack is Empty"); // throw
																	// error if
																	// stack is
																	// empty

	}

	// @Override
	public Iterator iterator() {
		return new ObjectIterator();
	}

	private void resize() {
		Object[] temp = new Object[2 * list.length];
		for(int i = 0; i < size; i++){
			temp[i] = list[i];
		}
		/*Optional*/
		//	System.arraycopy(list, 0, tmp, 0, list.length);
		list = temp;
	}

	/* Private inner class used by iterator() */
	private class ObjectIterator implements Iterator {
		/*
		 * Because iterator must start from the last element in, so I am
		 * starting the iterator from size -1
		 */
		
		private int count = size - 1;

		public Object next() {
			return list[count--];
		}

		public boolean hasNext() {
			return count >= 0;
		}
	}
}