package demo;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=" ";
	    //char[] rs=s.toCharArray();
		
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				s1=ch+s1;
			}
			System.out.println(s1);
	}

}
