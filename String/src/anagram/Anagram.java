package anagram;
import java.util.*;

public class Anagram {
	public static boolean checkAnagram(String s1,String s2) {
		String s3=s1.toLowerCase().replaceAll(" ","");
		String s4=s2.toLowerCase().replaceAll(" ","");
        
		if(s3.length()!=s4.length())
			return false;
		else {
			char[] arr1=s3.toCharArray();
			char[] arr2=s4.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1, arr2))
				return true;
			else
				return false;
		}
	}

	public static void main(String[] args) {
		String s1="MotherInLaw";
		String s2="Hitler Woman";
        System.out.println(Anagram.checkAnagram(s1,s2));
        System.out.println(Anagram.checkAnagram("keep","peek"));
        System.out.println(Anagram.checkAnagram("JavaTpoint","Javapoint"));
        
//        int []arr= {1,3,2,4};
//        System.out.println(Arrays.toString(arr));
	}

}
