package reverseStringWithoutSpecialCharcter;

public class ReverseStringWithoutSpecialCharcter {
	
	public static String reverse(char[]s) 
	{
		char []temp=new char[s.length];
		int x=0;
		
		for(int i=0;i<s.length;i++) {
			if(s[i]>='A' && s[i]<='Z' || s[i]>='a' && s[i]<='z') {
				temp[x]=s[i];
				x++;
			}
		}
		rev(temp,0,x);
		x=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]>='A' && s[i]<='Z' || s[i]>='a' && s[i]<='z') {
				s[i]=temp[x];
				x++;
			}
		} 
		
		String str=new String(s);
		return str;
		
		
	}
	public static void rev(char s[], int l, int r) {
		for (int i = l; i < r / 2; i++) {
            char temp = s[i];
            s[i] = s[r - 1 - i];
            s[r - 1 - i] = temp;
        }
	}

	public static void main(String[] args) {
		String str="ab&c,";
		char []ch=str.toCharArray();
		System.out.println(ReverseStringWithoutSpecialCharcter.reverse(ch));

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