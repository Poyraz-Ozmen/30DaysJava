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
		Position p = new Position(0,3);
		path.push(p); // we will use stack
		

		

		
		while(true) {
			int y = path.peek().y;
			int x = path.peek().x;
			//maze [path.peek().y][path.peek().x] = 0;
			maze[y][x] = 0;
			
			// down
			if(maze[y+1][x]==2) {
				System.out.println("Moved down");
				System.out.println("Moved down, You won");
				return;
			}
			else if(maze[y+1][x]==1) {
				path.push(new Position(y+1,x));
				continue;
			}
			
			//left
			if(maze[y][x-1]==2) {
				System.out.println("Moved down");
				System.out.println("Moved down, You won");
				return;
			}
			else if(maze[y][x-1]==1) {
				path.push(new Position(y+1,x));
				continue;
			}
			
			//up
			if(maze[y-1][x]==2) {
				System.out.println("Moved down");
				System.out.println("Moved down, You won");
				return;
			}
			else if(maze[y-1][x]==1) {
				path.push(new Position(y+1,x));
				continue;
			}
			//right
			if(maze[y-1][x+1]==2) {
				System.out.println("Moved down");
				System.out.println("Moved down, You won");
				return;
			}
			else if(maze[y-1][x+1]==1) {
				path.push(new Position(y+1,x));
				continue;
			}
			
			path.pop();  // will not visit more than once
			if(path.size()< 0) { // if there is no path from starting point 
				System.out.println("No path");
			}
		}
	}
}