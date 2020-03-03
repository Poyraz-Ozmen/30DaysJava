import java.util.LinkedList;

public class Stacks {
	// convert queue to stack
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		// instead of adding we will use push for stacks names.add("Caleb");
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
		
		// same idea we will use pop, System.out.println(names.remove());
		System.out.println(names.pop());
		System.out.println(names.remove());
		System.out.println(names.removeFirst()); // pop and RemoveFirst are equilavent
		// with remove we can use index, by default it removes last, like remove(4)
		// when it is executed Result is Sally-Sue-Caleb
		
		//search for stack trace
	}

}
