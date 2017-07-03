package sb223ce_assign4.stack;

import java.util.Iterator;

public class StackClass implements Stack {

	private Object[] list; // fields
	private Object obj;

	public StackClass() {
		list = new Object[0]; // Create constructor and initialize the field
		obj = null;
	}

	public int size() {

		return list.length; // return the size of list array

	}

	public boolean isEmpty() {
		return size() == 0; // return if list array is empty
	}

	public void push(Object element) {

		/*As the array size is zero in the beginning, so for saving the element
		 * in array we will always increase the size of array by 1. For this, we
		 * will use private method.
		 */
		
		resize();
		list[size() - 1] = element; // Now element can be saved in the array.

	}

	public Object pop() {
		
		/*First check if field array is empty or not.If yes, throw error. 
		 * If not, then take the top element from field array and save it
		 * in the object obj field. Now because this method also delete that 
		 * top element, for that create a new array whose size is 1 smaller 
		 * than the field array. Then transfer all the field array element 
		 * into it. By this we will delete the top element. Then convert that 
		 * array into field array. At, last return the top element.
		 */
	
		if (isEmpty() == false) {
			obj = list[list.length - 1];
			Object[] temp = new Object[list.length - 1];
			for (int i = 0; i < list.length - 1; i++) {
				temp[i] = list[i];
			}
			list = temp;
			return obj;
		} else {
			throw new IndexOutOfBoundsException("Stack is empty");
		}
	}

	
	public Object peek() {
		
		/*If array is not empty, get the top element and save it 
		 * in the obj field variable and return it. Otherwise,
		 * throw error.
		 */
		
		if (isEmpty() == false) {
			obj = list[list.length - 1];
			return obj;
		} else {
			throw new IndexOutOfBoundsException("Stack is empty");
		}
	}

	public Iterator iterator() {

		/* Create a new array of same size as field array.
		 * Now, transfer all the field array elements into it.
		 * Last element will go first because iteration will start
		 * from the top element.I used ArrayIterator which I create 
		 * by myself because I found hard to iterate on array without
		 * it. I created a new class for it. With the help of this
		 * I am printing all the left elements in the array.
		 */
		
		Object[] temp = new Object[size()];
		for (int i = size() - 1; i >= 0; i--) {
			temp[size() - 1 - i] = list[i];
		}
		ArrayIterator a = new ArrayIterator(temp, temp.length);
		while (a.hasNext()) {
			obj = a.next();
			System.out.println(obj);
		}
		return null;
	}

	private void resize() {
		
		/* Create a new array with size 1 greater than the field array. Then
		 * transfer all the elements of field array into it. At last, convert
		 * that array into field array. By doing this, we have 1 empty place in
		 * our field array where we can save the new element.
		 */
		
		Object[] temp = new Object[size() + 1];
		for (int i = 0; i < size(); i++) {
			temp[i] = list[i];
		}
		list = temp;
	}
}