package sb223ce_assign4.stack;

public class StackMain {
	public static void main(String[] args) throws Exception {

		Stack a = new StackClass();

		String s1 = "singh  1";
		String s2 = "singh  2";
		String s3 = "singh  3";
		String s4 = "singh  4";

		a.push(s1);
		a.push(s2);
		a.push(s3);
		a.push(s4);
		a.push(5);

		System.out.println("Size: " + a.size());
		System.out.println("Empty: " + a.isEmpty());
		System.out.println("Pop: " + a.pop());
		System.out.println("Pop : " + a.pop());
		System.out.println("Size: " + a.size());
		System.out.println("Peek : " + a.peek());
		a.iterator();

	}
}