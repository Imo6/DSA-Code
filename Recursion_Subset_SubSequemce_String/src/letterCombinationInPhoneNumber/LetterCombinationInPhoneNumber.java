package letterCombinationInPhoneNumber;

import java.util.ArrayList;
import java.util.List;

//public class LetterCombinationInPhoneNumber {
//	
//	public static void main(String[] args) {
//		String str="12";
//		subseq("",str);
//	}
//	public static void subseq(String p,String up)
//	{
//		if(up.isEmpty()) {
//			System.out.println(p);
//			return;
//		}
//		
//		int digit=up.charAt(0)-'0';
//		
//		for(int i=(digit-1)*3;i<digit*3;i++)
//		{
//			char ch=(char) ('a'+i);
//			subseq(p+ch,up.substring(1));
//		}	
//	}
//}



//public class LetterCombinationInPhoneNumber {
//	
//	public static void main(String[] args) {
//		String str="12";
//		List<String> reslist=subseq("",str);
//		System.out.println(reslist);
//	}
//	public static List<String> subseq(String p,String up)
//	{
//		if(up.isEmpty()) {
//			List<String> list=new ArrayList<String>();
//			list.add(p);
//			return list;
//		}
//		
//		int digit=up.charAt(0)-'0';
//		
//		List<String> list=new ArrayList<String>();
//		for(int i=(digit-1)*3;i<digit*3;i++)
//		{
//			char ch=(char) ('a'+i);
//			list.addAll(subseq(p+ch,up.substring(1)));
//		}	
//		return list;
//	}
//}



public class LetterCombinationInPhoneNumber {
	
	public static void main(String[] args) {
		String str="12";
		int res=subseq("",str);
		System.out.println(res);
	}
	public static int subseq(String p,String up)
	{
		if(up.isEmpty()) {
			return 1;
		}
		
		int digit=up.charAt(0)-'0';
		
		int count=0;
		for(int i=(digit-1)*3;i<digit*3;i++)
		{
			char ch=(char) ('a'+i);
			count=count+subseq(p+ch,up.substring(1));
		}	
		return count;
	}
}

