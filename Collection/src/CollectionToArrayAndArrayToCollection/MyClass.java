package CollectionToArrayAndArrayToCollection;

import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array to Collection
		int Array[] = {4,5,4,3,1,4 };
		
	        List<Integer> list=new ArrayList<>();
	        
	        for(int i:Array)
	        	list.add(i);
	        
	        System.out.println(list);
		
		//Collection to Array
		List<Integer> list2=new ArrayList<>();
		list2.add(4);
		list2.add(1);
		list2.add(3);	
		list2.add(7);
		list2.add(5);
		
		System.out.println(list2);
		Collections.sort(list2);
		
//		Integer[] arr=new Integer[list2.size()];
//		list2.toArray(arr);
		Integer[] arr=list2.toArray(new Integer[0]);
		
		for(Integer i:arr)
			System.out.println(i);
		
		
		String countryArray[]
	            = {"Geeks", "Imran", "A Computer Portal"};
	        
	        List<String> list1=new ArrayList<>();
	        
	        for(String i:countryArray)
	        	list1.add(i);
	        
	        System.out.println(list1);
		
		List<String> list3=new ArrayList<>();
		list3.add("geeks");
		list3.add("for");
		list3.add("geek");	
		list3.add("imran");
		list3.add("vita");
		
		System.out.println(list3);
		
		String[] arr5=new String[list3.size()];
		list3.toArray(arr5);
		
		for(String i:arr5)
			System.out.println(i);
	}

}
