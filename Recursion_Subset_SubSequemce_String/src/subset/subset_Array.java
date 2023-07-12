package subset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class subset_Array {

	public static void main(String[] args) {
		int []arr= {1,2,3};
		List<List<Integer>> res=subset(arr);
		for(List<Integer> list:res)//list of Integer for every list in my res
			System.out.println(list);//just print that list
	}
	public static List<List<Integer>> subset(int[] arr) {
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<Integer>());//adding empty arraylist
		
		for(int num:arr)//for every number in my array
		{
			int n=outer.size();//I need to take size of the list
			for(int i=0;i<n;i++)
			{
				List<Integer> inner=new ArrayList<>(outer.get(i));//and create a new list
				inner.add(num);//num is an element, not an index
				outer.add(inner);//add number into original list
			}
			
		}
		return outer;
		
	}

}
