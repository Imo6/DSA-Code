package firstNonRepeatedCharacter;
import java.util.*;
public class FirstNonRepeatedCharacter {
	
	public static void findOccurance(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i),s.indexOf(s.charAt(i))+1)== -1){
				        System.out.println("First non-repeating character is "+ s.charAt(i));
				        break;
		   }
		}
	}

	public static void main(String[] args) {
		String s="geeksforgeeks";
		FirstNonRepeatedCharacter.findOccurance(s);
		System.out.println(s.indexOf('g',1));
	
	}

}
