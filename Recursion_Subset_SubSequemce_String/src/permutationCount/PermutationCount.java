package permutationCount;

import java.util.ArrayList;
import java.util.List;

public class PermutationCount {
	public static void main(String[] args) {
	String str="abc";
	int totalcount=Permutation("",str);
	System.out.println(totalcount);

}
public static int Permutation(String p,String up)
{
	if(up.isEmpty()) {
		//System.out.println(p);
		return 1;
	}
	
	int count=0;
	char ch=up.charAt(0);
	for(int i=0;i<=p.length();i++)
	{
		String first=p.substring(0,i);
		String second=p.substring(i,p.length());
		count=count+Permutation((first+ch+second),up.substring(1));
	}
	return count;
}

}

