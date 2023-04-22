package panagrams;
import java.util.*;
public class Panagrams {
	public static String pangrams(String s) {
	    // Write your code here
	   String ss=s.toLowerCase();
	    Set<Character> h=new HashSet<>();
	    for(int i=0;i<s.length();i++){
	    	if(ss.charAt(i)!=' ') {
	        h.add(ss.charAt(i));
	    	}
	        }
	    if(h.size() == 26){
	        return "pangram";
	    }else{
	         return "not pangram";
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=Panagrams.pangrams("We promptlyjudgedantiqueivorybucklesforthenextprize");
		System.out.println(s);

	}

}
