import java.util.Iterator;
import java.util.LinkedList;

public class Iterators {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");
	
		Iterator<String> it = names.iterator();
		//System.out.println(it.next());
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String s: names) {
			System.out.println(s);
			// this is similar to python
			// it will print each element
			
		}
		
		names.add(2,"Susan");// put it on the index 2
		
		// instead of using below code, using add method is more easy
		//it.next();
		//it.next();
		//it.add("Susan");
	}

}
