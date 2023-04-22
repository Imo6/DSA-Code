package removeDuplicate;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
