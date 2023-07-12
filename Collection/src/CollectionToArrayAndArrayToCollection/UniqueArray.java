package CollectionToArrayAndArrayToCollection;
import java.util.*;
public class UniqueArray {

	public static void main(String[] args) {		
		
int []arr= {4,5,4,2,5,3};
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(arr[i]))
				set.add(arr[i]);
			else
				set.remove(arr[i]);
			
		}
		
		System.out.println(set);
		
		//convert collection into Array again
//		Integer[] distinctArr1 = new Integer[set.size()];
//		set.toArray(distinctArr);
		Integer[] distinctArr = set.toArray(new Integer[0]);
		
		for(int i:distinctArr)
			System.out.print(i+" ");
		
	}

}
