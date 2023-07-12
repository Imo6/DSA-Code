package HighestElementInArray;
import java.util.*;

public class HighestLowest {

	public static void main(String[] args) {
//		int []arr= {7,10,15,-5,13,2,0,11,-5};
		int []arr= {7,17,27,-77};
		List<Integer> list=new ArrayList<>();
		
		for(int i:arr)
			list.add(i);
		System.out.println(list);
	
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		
		//sort
		Collections.sort(list);
		//after sorting again into array
		Integer[] newarr=new Integer[list.size()];
		list.toArray(newarr);
		for(Integer i:newarr)
			System.out.print(i+" ");

	}

}
