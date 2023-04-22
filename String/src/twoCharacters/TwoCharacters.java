package twoCharacters;

public class TwoCharacters {
	/*static int alternate(String s) {
	    int res=0;
	    for(int i=0;i<26;++i){
	        
	        char ch1=(char) ('a'+i);
	        
	        for(int j=0;j<26;++j){
	            
	            if(i==j) continue;
	            
	            char ch2=(char) ('a'+j);
	            
	            int cnt=0;
	            char prev_char=ch2;
	          
	            for(int k=0;k<s.length();++k){
	               
	               if(s.charAt(k)==ch1 || s.charAt(k)==ch2){
	                
	                if(s.charAt(k)==ch1 && prev_char==ch2){
	                   prev_char=ch1;
	                   cnt++;
	                }
	                else if (s.charAt(k)==ch2 && prev_char==ch1 ){
	                    prev_char=ch2;
	                    cnt++;
	                }
	                else {
	                    cnt=0;
	                    break;
	                }    
	               
	               }   
	            }
	        
	            if(cnt>1) res=Math.max(cnt,res);
	        }
	    }
	     
	    return res;

	}*/
	public static String hackerrankInString(String s) {
	    // Write your code here
	    String str="hackerrank";
	    char[] ch_s=s.toCharArray();
	    char[] ch_str=str.toCharArray();
	    char[] c=new char[str.length()];
	    int k=0;
	    for(int i=0;i<str.length();i++){
	        for(int j=k;j<s.length();j++){
	        	if(ch_str[i]==ch_s[j]){

	        		c[i]=ch_s[k];
	                k++;
	                break;
	            }
	            k++;
	        }
	    }
	    String ss=new String(c);
	    //ss=ss.trim();
	   return ss.equals(str) ? "YES" : "NO";
	    //return ss;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//asdcbsdcagfsdbgdfanfghbsfdab
		//beabeefeab
//		int res=TwoCharacters.alternate("asdcbsdcagfsdbgdfanfghbsfdab");
//		System.out.println(res);
		String res=TwoCharacters.hackerrankInString("hackerworld");
		System.out.println(res);
	}

}
