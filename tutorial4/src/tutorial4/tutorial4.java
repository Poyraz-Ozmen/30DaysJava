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
