package palindromIndex;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		System.out.println("Palindrome Index");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int res=palindromeIndex(str);
        System.out.println(res);

	}
	public static int palindromeIndex(String str){
        //aabccccaa
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                if(i+1<str.length()){
                    boolean b=isPalindrome(str.substring(i+1,str.length()-i));
                    if(b){ return i; }
                    else{ return str.length()-i-1; }
                }
            }
        }
        return -1;
    }
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
