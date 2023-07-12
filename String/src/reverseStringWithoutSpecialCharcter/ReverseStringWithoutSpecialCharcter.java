package reverseStringWithoutSpecialCharcter;

public class ReverseStringWithoutSpecialCharcter {
	
//	public static String reverse(char[]s) 
//	{
//		char []temp=new char[s.length];
//		int x=0;
//		
//		for(int i=0;i<s.length;i++) {
//			if(s[i]>='A' && s[i]<='Z' || s[i]>='a' && s[i]<='z') {
//				temp[x]=s[i];
//				x++;
//			}
//		}
//		rev(temp,0,x);
//		x=0;
//		for(int i=0;i<s.length;i++) {
//			if(s[i]>='A' && s[i]<='Z' || s[i]>='a' && s[i]<='z') {
//				s[i]=temp[x];
//				x++;
//			}
//		} 
//		
//		String str=new String(s);
//		return str;
//		
//		
//	}
//	public static void rev(char s[], int l, int r) {
//		for (int i = l; i < r / 2; i++) {
//            char temp = s[i];
//            s[i] = s[r - 1 - i];
//            s[r - 1 - i] = temp;
//        }
//	}

	public static void main(String[] args) {
//		String str="ab&c,";
//		char []ch=str.toCharArray();
//		System.out.println(ReverseStringWithoutSpecialCharcter.reverse(ch));
		
		
		String str="ab&c,m";
//		char[] ch=str.toCharArray();
//		int len=str.length();
//		int i=0;
//		int j=len-1;
//		
//		for(i=0;i<len;) {
//			if(str.charAt(i)>=65 && str.charAt(i)<=90||str.charAt(i)>=97&& str.charAt(i)<=122) {
//				//swap
//				char temp=ch[i];
//				ch[i]=ch[j];
//				ch[j]=temp;
//				i++;
//				j--;
//				continue;
//			}else if(str.charAt(i)<=65 || str.charAt(i)>=122 || str.charAt(i)>=91 && str.charAt(i)<=96) {
//				i++;continue;
//			}else if(str.charAt(j)<=65 || str.charAt(j)>=122 || str.charAt(j)>=91 && str.charAt(j)<=96) {
//				j--;continue;
//			}
//		}
		
		char[] strchar=str.toCharArray();
		char[] temp=new char[str.length()];
		int x=0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)<=65 || str.charAt(i)>=122 || str.charAt(i)>=91 && str.charAt(i)<=96) {
				temp[i]=str.charAt(i);
				x++;
			}
		}
		reverse(temp,0, x);
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)<=65 || str.charAt(i)>=122 || str.charAt(i)>=91 && str.charAt(i)<=96) {
				strchar[i]=temp[i];
			}
		}
		String str1=new String(strchar);
		System.out.println(strchar);

	}
	public static void reverse(char[] temp,int s,int e) {
//		int i=0;
//		int j=temp.length-1;
		while(s<e) {
			//swap
			char t=temp[s];
			temp[s]=temp[e];
			temp[e]=t;
			s++;
			e--;
		}
	}

}


////method-2
//package reverseStringWithoutSpecialCharcter;
//
//public class ReverseStringWithoutSpecialCharcter {
//	
//	public static String reverse(char[]ch) 
//	{
//		int l=0;
//		int r=ch.length-1;
//		
//		while(l<r) {
//			if(!Character.isAlphabetic(ch[l]))
//				l++;
//			else if(!Character.isAlphabetic(ch[r]))
//				r--;
//			else {
//				//swap
//				char temp=ch[l];
//				ch[l]=ch[r];
//				ch[r]=temp;
//				l++;
//				r--;
//			}
//		}
//		
//		String s=new String(ch);
//		return s;
//	}
//
//	public static void main(String[] args) {
//		String str="ab&c,";
//		char []ch=str.toCharArray();
//		System.out.println(ReverseStringWithoutSpecialCharcter.reverse(ch));
//
//	}
//
//}