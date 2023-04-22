package StringReadInReverseOrder;
import java.util.*;

public class StringReadInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="My name is Imran";
//		String str1=" ";
//		String[] word=str.split(str1);
//		List<String> list=new ArrayList<>();
//		for(int i=word.length-1;i>=0;i--) {
//			list.add(word[i]);
//		}
//		System.out.println(list);
//		
//		/*StringBuilder sbr=new StringBuilder();
//		for(String ch:list)
//			sbr.append(ch);
//		
//		System.out.println(sbr);
//		*/
		
		String str="My name is Imran";
		String str1=" ";
		String[] word=str.split(str1);
	
		for(int i=word.length-1;i>=0;i--) {
			System.out.print(word[i]+str1);
			
		}

	}

}
