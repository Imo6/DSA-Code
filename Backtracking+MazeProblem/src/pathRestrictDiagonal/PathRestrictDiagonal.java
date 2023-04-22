package pathRestrictDiagonal;

import java.util.ArrayList;
import java.util.List;

//public class PathRestrictDiagonal {
//
//	public static void main(String[] args) {
//		pathRetDiagonal("",3,3);
//	}
//
//	public static void pathRetDiagonal(String p, int r, int c) {
//		
//		if(r==1 && c==1) {
//			System.out.println(p);
//			return;
//		}
//		
//		if(r>1)
//		pathRetDiagonal(p+'V',r-1,c);
//		
//		if(c>1)
//			pathRetDiagonal(p+'H',r,c-1);
//		
//		if(r>1 && c>1)
//			pathRetDiagonal(p+'D',r-1,c-1);
//	}
//
//}


public class PathRestrictDiagonal {

	public static void main(String[] args) {
		List<String> list=pathRetDiagonal("",3,3);
		System.out.println(list);
	}

	public static List<String> pathRetDiagonal(String p, int r, int c) {
		
		if(r==1 && c==1) {
			List<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		List<String> locallist=new ArrayList<String>();
		if(r>1)
		locallist.addAll(pathRetDiagonal(p+'V',r-1,c));
		
		if(c>1)
			locallist.addAll(pathRetDiagonal(p+'H',r,c-1));
		
		if(r>1 && c>1)
			locallist.addAll(pathRetDiagonal(p+'D',r-1,c-1));
		
		return locallist;
	}

}

