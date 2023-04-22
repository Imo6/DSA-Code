//package removeSpaceFromString;
//import java.util.*;
//
//public class RemoveSpaceFromString{
//
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
//		
//		
//		
//		
////		Stack<Integer> s=new Stack<Integer>();
////		s.push(10);
////		s.push(20);
////		s.push(30);
////		s.push(40);
////		System.out.println(s);
////		s.remove(0);
////		System.out.println(s);
////		System.out.println(s.pop());
//		
//		
//
//	}
//
//}


package removeSpaceFromString;
import java.util.*;
import java.util.regex.Pattern;

public class RemoveSpaceFromString{
	// Method to reverse words of a String
    static String reverseWords(String str)
    {
 
        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");
 
        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        // is whitespace and store in temp array.
        String[] temp = pattern.split(str);
        String result = "";
 
        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                result = temp[i] + result;
                //System.out.println(result);
            }
            else {
                result = " " + temp[i] + result;
               // System.out.println(result);
            }
        }
        return result;
    }

	public static void main(String[] args) {
		String str="java program is platform independent";
		String res=RemoveSpaceFromString.reverseWords(str);
		System.out.println(res);
	

	}

}

