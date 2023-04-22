package stringReverse;

import java.util.HashSet;
import java.util.Set;

public class StringReverse {
//	public static String strreverse(String s) {
//		String revstr="";
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			revstr=ch+revstr;
//		}
//		return revstr;
		/*String strrev="";
	    Set<Integer> h=new HashSet<>();
	    for(int i=0;i<s.length();i++){
	        char ch=s.charAt(i);
	        strrev=ch+strrev;
	    }
	    
	    for(int i=0;i<s.length();i++){
	       if(i+1<s.length()){
	            int sum=((int)s.charAt(i+1)-(int)s.charAt(i))+((int)strrev.charAt(i+1)-(int)strrev.charAt(i));
	             h.add(sum);
	       }
	    }
	    
	    if(h.size()== 1){
	        return "Funny";
	    }else{
	        return "Not Funny";
	    }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String res=StringReverse.strreverse("cabasc");
//		System.out.println(res);
		
		String s="aaba";
		String copy = new StringBuilder(s).reverse().toString();
		if (copy.equals(s)) {
		    System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
