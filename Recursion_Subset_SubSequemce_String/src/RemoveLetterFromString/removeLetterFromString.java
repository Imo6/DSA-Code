package RemoveLetterFromString;

//I convert string to char array then remove
//import java.util.Arrays;
//public class removeLetterFromString {
//
//	public static void main(String[] args) {
//		String str="baccad";
//		char []arr=skip(str);
//		for(int i=0;i<str.length();i++)
//		{
//			System.out.print(arr[i]);
//		}
//
//	}
//	//                       " "         baccad
//	public static char[] skip(String rem)
//	{
//		char []arr1=new char[rem.length()];
//		char []arr=new char[rem.length()];
//		for(int i=0;i<rem.length();i++) {
//			 arr[i]=rem.charAt(i);
//		}
//		for(int j=0;j<arr.length;j++) {
//			if(arr[j]!= 'a')
//				arr1[j]=arr[j];
//		}
//		return arr1;
//		
//		
//	}
//
//}

//import java.util.Arrays;
//
//public class removeLetterFromString {
//
//	public static void main(String[] args) {
//		String str="baccad";
//		skip("",str);
//	}
//	//                       " "         baccad
//	public static void skip(String p,String up)
//	{
//		if(up.isEmpty()) {
//			System.out.println(p);
//			return;
//		}
//		char ch=up.charAt(0);
//		if(ch=='a')
//			skip(p,up.substring(1));
//		else
//			skip(p+ch,up.substring(1));
//	}
//
//}


import java.util.Arrays;

public class removeLetterFromString {

	public static void main(String[] args) {
		String str="baccad";
		String res=skip(str);
		System.out.println(res);
	}
	//                       baccad
	public static String skip(String up)
	{
		if(up.isEmpty()) {
			return "";
		}
		char ch=up.charAt(0);
		if(ch=='a')
			return skip(up.substring(1));
		else
			return ch+skip(up.substring(1));
	}

}
