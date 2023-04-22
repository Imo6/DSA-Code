package subsetDuplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetDuplicate {

	public static void main(String[] args) {
		int []arr= {1,2,2};
		List<List<Integer>> res=subsetDup(arr);
		for(List<Integer> list:res)//list of Integer for every list in my res
			System.out.println(list);//just print that list

	}
	public static List<List<Integer>> subsetDup(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<Integer>());
		
		int start=0;
		int end=0;
		for(int i=0;i<arr.length;i++)//for every number in my array
		{
			start=0;
			int n=outer.size();//I need to take size of the list
			if(i>0 && arr[i]==arr[i-1])
			{
				start=end+1;
			}
			end=outer.size()-1;
			for(int j=start;j<n;j++)
			{
				List<Integer> inner=new ArrayList<>(outer.get(j));//and create a new list
				inner.add(arr[i]);
				outer.add(inner);//add number into original list
			}
			
		}
		return outer;
		
	}

}
