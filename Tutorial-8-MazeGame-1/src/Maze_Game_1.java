import java.util.LinkedList;

public class Maze_Game_1 {
	
		static Maze m = new Maze();

		static LinkedList<Position> path = new LinkedList<Position>();

		public static void main(String[] args) {
			
			int[][] maze = {
				{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
				{0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0},
				{0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1},
				{1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0},
				{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
				{0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}
			};		//0 = wall //1 = path
			
			m.maze = maze;
			m.start = new Position(4, 8);
			m.path = new LinkedList<Position>();
			
			Position p = new Position(4, 8);
			m.path.push(p);


			while(true) {
				int y = m.path.peek().y;
				int x = m.path.peek().x;

				m.maze[y][x] = 0;
				

				//down

				if(isValid(y+1, x)) {
					if(m.maze[y+1][x] == 2) {
						System.out.println("Moved down. You won!");
						return;
					} else if(m.maze[y+1][x] == 1) {
						System.out.println("Moved down");
						m.path.push(new Position(y+1, x));
						continue;
					}
				}
				

				//left

				if(isValid(y, x-1)) {
					if(m.maze[y][x-1] == 2) {
						System.out.println("Moved left. You won!");
						return;
					} else if(m.maze[y][x-1] == 1) {
						System.out.println("Moved left");
						m.path.push(new Position(y, x-1));
						continue;
					}
				}

				//up

				if(isValid(y-1, x)) {
					if(m.maze[y-1][x] == 2) {
						System.out.println("Moved up. You won!");
						return;
					} else if(m.maze[y-1][x] == 1) {
						System.out.println("Moved up");
						m.path.push(new Position(y-1, x));
						continue;
					}
				}
				

				//right
				if(isValid(y, x+1)) {
					if(m.maze[y][x+1] == 2) {
						System.out.println("Moved right. You won!");
						return;
					} else if(m.maze[y][x+1] == 1) {
						System.out.println("Moved right");
						m.path.push(new Position(y, x+1));
						continue;
					}
				}

				m.path.pop();
				System.out.println("Moved back");
				if(path.size() <= 0) {
					System.out.println("No path");
					return;
				}
			}

		}

		public static boolean isValid(int y, int x) {
			if(y < 0 || 
				y >= m.maze.length ||
				x < 0 ||
				x >= m.maze[y].length
			 ) {
				return false;
			}
			return true;
		}

	}