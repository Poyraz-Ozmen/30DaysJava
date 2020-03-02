/**
 * 
 */
package tutorial4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author poyraz
 *
 */
public class tutorial4 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("students.txt"));
		List<String> students = new ArrayList<String>();
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
	}
}
