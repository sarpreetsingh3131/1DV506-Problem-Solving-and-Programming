package sb223ce_assign4.stack;

import java.util.Iterator;

public class StackMain {
	public static void main(String[] args) throws Exception {

		StackClass a = new StackClass();

		for(int i = 0; i < 15; i++){
			a.push(i);
		}
	

		System.out.println("Size: " + a.size());
		System.out.println("Empty: " + a.isEmpty());
		System.out.println("Pop: " + a.pop());
	//	System.out.println("Pop : " + a.pop());
		System.out.println("Size: " + a.size());
		System.out.println("Peek : " + a.peek());
		
		
		
		
		Iterator i = a.iterator();
		while(i.hasNext()){
			System.out.println(i.next());	
			}

	}
}