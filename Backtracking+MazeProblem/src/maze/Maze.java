package maze;

import java.util.ArrayList;
import java.util.List;

//public class Maze {
//
//	public static void main(String[] args) {
//		System.out.println(countfun(3,3));
//	}
//
//	public static int countfun(int r, int c) {
//		
//		if(r==1 || c==1)
//			return 1;
//		
//		int left=countfun(r-1,c);
//		int right=countfun(r,c-1);
//		return left+right;
//	}
//
//}


//public class Maze {
//
//	public static void main(String[] args) {
//		pathfun("",3,3);
//	}
//
//	public static void pathfun(String p,int r, int c) {
//		
//		if(r==1 && c==1) {
//			System.out.println(p);
//			return;
//		}
//		
//		if(r>1)
//			pathfun(p+'D',r-1,c);
//		if(c>1)
//			pathfun(p+'R',r,c-1);
//		
//	}
//
//}




public class Maze {

	public static void main(String[] args) {
		List<String> list=pathfun("",3,3);
		System.out.println(list);
	}

	public static List<String> pathfun(String p,int r, int c) {
		
		if(r==1 && c==1) {
			List<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		List<String> locallist=new ArrayList<String>();
		if(r>1)
			locallist.addAll(pathfun(p+'D',r-1,c));
		if(c>1)
			locallist.addAll(pathfun(p+'R',r,c-1));
		return locallist;
		
	}

}


