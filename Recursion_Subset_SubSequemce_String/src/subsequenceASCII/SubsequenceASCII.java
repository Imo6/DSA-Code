package subsequenceASCII;

import java.util.ArrayList;
import java.util.List;

//public class SubsequenceASCII {
//
//	public static void main(String[] args) {
//		String str="abc";
//		subseqASCII("",str);
//
//	}
//	public static void subseqASCII(String p,String up)
//	{
//		if(up.isEmpty()) {
//			System.out.println(p);
//			return;
//		}
//		
//		char ch=up.charAt(0);
//		subseqASCII(p+ch,up.substring(1));
//		subseqASCII(p,up.substring(1));
//		subseqASCII(p+(ch+0),up.substring(1));
//	}
//}




public class SubsequenceASCII {

	public static void main(String[] args) {
		String str="abc";
		List<String> reslist=subseqASCII("",str);
		System.out.println(reslist);

	}
	public static List<String> subseqASCII(String p,String up)
	{
		List<String> list=new ArrayList<String>();
		if(up.isEmpty()) {
			list.add(p);
			return list;
		}
		
		char ch=up.charAt(0);
		List<String> left=subseqASCII(p+ch,up.substring(1));
		List<String> right=subseqASCII(p,up.substring(1));
		List<String> ascii=subseqASCII(p+(ch+0),up.substring(1));
		left.addAll(right);
		left.addAll(ascii);
		return left;
	}
}

