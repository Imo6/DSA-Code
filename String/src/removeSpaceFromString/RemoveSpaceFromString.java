package removeSpaceFromString;
import java.util.*;

////Method-1
//public class RemoveSpaceFromString{
//	public static void main(String[] args) {
//		Queue<Character> queue=new LinkedList<>();
//		String str="java program is platform independent";
//		char[] arr=new char[str.length()];  
//		
//		for(int i=0;i<str.length();i++){
//			arr[i]=str.charAt(i);
//		}
//		
//		for(int i=0;i<arr.length;i++){
//			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o'||arr[i]=='u'){
//				continue;
//			}
//			if(arr[i]!=' ') {
//				   queue.add(arr[i]);
//			}
//		}
//		
//		//System.out.println(queue);
//		
//		StringBuilder sb=new StringBuilder();
//		for(Character c:queue)
//			sb.append(c);
//		System.out.println(sb);
//
//		}
//	}
//
//}

//Method-2
public class RemoveSpaceFromString{
	public static void main(String[] args) {
		
		String str="java program is platform independent";
		String str1=str.replace(" ", "");
		char[] ch=str1.toCharArray();		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
				continue;
			}
			System.out.print(ch[i]);
		}
	}

}