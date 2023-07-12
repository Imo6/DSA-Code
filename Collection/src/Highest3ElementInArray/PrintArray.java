package Highest3ElementInArray;
import java.util.*;
public class PrintArray {

	public static void main(String[] args) {
		int []arr= {7,10,15,-5,13,2,0,11,-5};
//		int []arr= {7,17,27,-77};
		
		List<Integer> list=new ArrayList<>();
		for(Integer i:arr)
			list.add(i);
		Collections.sort(list);
		System.out.println(list);
		
		List<Integer> list1=new ArrayList<>();
		int count=3;
		for(int i=list.size()-1;i>=0;i--) {
			if(count>0) {
				list1.add(list.get(i));
				count--;
			}
		}
		System.out.println(list1);

	}

}
