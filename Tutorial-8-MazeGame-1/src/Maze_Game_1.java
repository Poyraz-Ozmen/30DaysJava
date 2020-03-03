import java.util.LinkedList;

public class Maze_Game_1 {
	
	
	static int[][] maze = {
			{2,0,1,1},
			{1,1,0,1},
			{0,0,1,0}
	};
	 // 0 is wall, 1 is path, 2 is destination 
	//  will start from [0][3]
	
	static LinkedList<Position> path = new LinkedList<Position>(); // since path.push, it should be in format of static
	
	public static void main(String[] args) {
		Position p = new Position(3,0);
		path.push(p); // we will use stack
	
		maze [path.peek().y][path.peek().x] = 0;
		
	}
}