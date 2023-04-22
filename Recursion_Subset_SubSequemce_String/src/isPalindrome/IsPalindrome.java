package isPalindrome;

public class IsPalindrome {
	private static boolean Palindrome(String p) {
		// TODO Auto-generated method stub
		int start=0;
		int end=p.length()-1;
		while(start<end) {
			if(p.charAt(start)==p.charAt(end)) {
				start++;
				end--;
			}
			else
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=IsPalindrome.Palindrome("cabac");
		System.out.println(b);

	}

}
