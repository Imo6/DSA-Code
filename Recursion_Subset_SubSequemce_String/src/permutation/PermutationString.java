package permutation;

import java.util.ArrayList;
import java.util.List;

//public class PermutationString {
//
//	public static void main(String[] args) {
//		String str="abc";
//		Permutation("",str);
//
//	}
//	public static void Permutation(String p,String up)
//	{
//		if(up.isEmpty()) {
//			System.out.println(p);
//			return;
//		}
//		
//		char ch=up.charAt(0);
//		for(int i=0;i<=p.length();i++)
//		{
//			String first=p.substring(0,i);
//			String second=p.substring(i,p.length());
//			Permutation((first+ch+second),up.substring(1));
//		}
//	}
//
//}


public class PermutationString {

	public static void main(String[] args) {
		String str="abc";
		 List<String> reslist=Permutation("",str);
		 System.out.println(reslist);

	}
	public static List<String> Permutation(String p,String up)
	{
		if(up.isEmpty()) {
			List<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		List<String> locallist=new ArrayList<String>();
		char ch=up.charAt(0);
		for(int i=0;i<=p.length();i++)
		{
			String first=p.substring(0,i);
			String second=p.substring(i,p.length());
			locallist.addAll(Permutation((first+ch+second),up.substring(1)));
		}
		return locallist;
		
		
	}

}

