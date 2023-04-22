package subset_DiceSum;

import java.util.ArrayList;
import java.util.List;

//public class Subset_DiceSum {
//
//	public static void main(String[] args) {
//		int sum=4;
//		SubsetDice("",sum);
//
//	}
//	public static void SubsetDice(String p,int target)
//	{
//		if(target==0) {
//			System.out.println(p);
//			return;
//		}
//		
//		for(int i=1;i<=6 && i<=target;i++)
//		{
//			SubsetDice(p+i,target-i);
//		}
//	}
//
//}



public class Subset_DiceSum {

	public static void main(String[] args) {
		int sum=4;
		List<String> reslist=SubsetDice("",sum);
		System.out.println(reslist);

	}
	public static List<String> SubsetDice(String p,int target)
	{
		if(target==0) {
			List<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		List<String> locallist=new ArrayList<String>();
		for(int i=1;i<=6 && i<=target;i++)
		{
			locallist.addAll(SubsetDice(p+i,target-i));
		}
		return locallist;
	}

}

