package removeDuplicate;
import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s="mdimran alam";
		String result="";
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i); 
			// Check if the character is already in the result string
			if(result.indexOf(ch)==-1) {
				result+=ch;
			}
		}
		System.out.println(result);
		
		
//		//method-2
//		String s="mdimran alam";
//		Set<Character> set=new HashSet<>();
//		
//		for(int i=0;i<s.length();i++) {
//			set.add(s.charAt(i));
//		}
//		Object[] ch=set.toArray();
//		for(int i=0;i<ch.length-1;i++) {
//			System.out.print(ch[i]);
//		}
	}

}
