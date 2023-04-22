package subsequence;

import java.util.ArrayList;
import java.util.List;

//public class subsequence {
//	public static void main(String[] args) {
//		String str="abc";
//		int res=subSeq("",str);
//		System.out.println(res);
//
//	}
//   //                        p=>processed    up=>unprocessed
//	public static int subSeq(String p, String up) {
//		int count=0;
//		if(up.isEmpty()) {
//			if(isPalindrome(p)==true)
//			count++;//System.out.println(p);
//			return count;
//		}
//		
//		char ch=up.charAt(0);
//		subSeq(p+ch,up.substring(1));
//		subSeq(p,up.substring(1));
//		return count;
//	}
//private static boolean isPalindrome(String p) {
//	// TODO Auto-generated method stub
//	int start=0;
//	int end=p.length()-1;
//	while(start<end) {
//		if(p.charAt(start)==p.charAt(end)) {
//			start++;
//			end--;
//		}
//		else
//			return false;
//	}
//	
//	return true;
//}
//
//}



//	This logic to store answer in ArrayList
public class subsequence {
	public static void main(String[] args) {
		String str="abc";
		List<String> list=subSeq("",str);
		System.out.println(list);
	}
   //                        p=>processed    up=>unprocessed
	public static List<String> subSeq(String p, String up) {
		List<String> list=new ArrayList<String>();
		if(up.isEmpty()) {
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		List<String> left=subSeq(p+ch,up.substring(1));
		List<String> right=subSeq(p,up.substring(1));
		left.addAll(right);
		return left;
		
	}

}




