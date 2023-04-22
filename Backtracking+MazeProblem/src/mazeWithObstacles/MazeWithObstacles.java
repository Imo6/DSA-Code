package mazeWithObstacles;

public class MazeWithObstacles {

	public static void main(String[] args) {
		boolean [][] board= {
				{true,true,true},
				{true,false,true},
				{true,true,true}
		};
		pathwithObstacles("",board,0,0);

	}
	public static void pathwithObstacles(String p,boolean [][] maze,int r,int c)
	{
		if(r==maze.length-1 && c==maze[0].length-1){
			System.out.println(p);
			return;
		}
		
//		if(maze[r][c]==false)
//			return;
		if(!maze[r][c])
			return;
		
		if(r<maze.length-1)
			pathwithObstacles(p+'V',maze,r+1,c);
		
		if(c<maze[0].length-1)
			pathwithObstacles(p+'H',maze,r,c+1);
			
	}

}
