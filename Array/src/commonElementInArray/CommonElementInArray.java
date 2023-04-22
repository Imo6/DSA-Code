package commonElementInArray;
import java.util.*;
public class CommonElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1= {1,2,3,5,6};
		int []arr2= {2,4,5,7,9,55};
		
		List<Integer> list=new ArrayList<>();
		
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) 
		{
			if(arr1[i]==arr2[j]) 
			{
				list.add(arr1[i]);
				i++;j++;
			}
			else if(arr1[i]<arr2[j])
				i++;
			else
				j++;
				
		}
		
		System.out.println(list);

	}

}
