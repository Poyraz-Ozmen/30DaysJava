/**
 * 
 */
package tutorial4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * @author poyraz
 *
 */
public class tutorial4 {

	//Collection<String> stuff;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("students.txt"));
		List<String> students = new ArrayList<String>();
		
		// you can use collections <String> students = new ArrayList<String>();
		// left side we use list, on the right we used implementation of list
		// arraylist is collection of list
		// left side is collection interface
		// check collection on dosc.oracle-java collection 
		
		
		
		while(in.hasNextLine()) {
			students.add(in.nextLine());
			//System.out.println(in.nextLine());
			
		}
		in.close();
		for (int i = 0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		//tutorial4 p = new tutorial4();
		//p.stuff = new LinkedList<String>();
		// in above commented 2 lines and, we did not get any errors because stuff is implemented as a collection 
		// so we can return any type of the collection
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("Caleb");
		names.add("Sue");
		names.add("Sally");
		
		System.out.println(names.remove());
		System.out.println(names.remove());
		System.out.println(names.remove());
	}
}
