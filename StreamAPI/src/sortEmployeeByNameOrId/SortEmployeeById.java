package sortEmployeeByNameOrId;

import java.util.*;
import java.util.stream.Collectors;

//public class SortEmployeeById {
//	public static void main(String[] args) {
//		List<Integer> list=new ArrayList<>();
//		list.add(5);
//		list.add(100);
//		list.add(34);
//		list.add(65);
//		list.add(67);
//		
//		List<Integer> s=list.stream().collect(Collectors.toList());
//		System.out.println(s);
//		
//		List<Integer> s1=list.stream().sorted().collect(Collectors.toList());
//		System.out.println(s1);
//		
//		List<Integer> s2=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
//		System.out.println(s2);
//
//		List<Integer> s3=list.stream().sorted(
//				(i1,i2)->{
//					if(i1<i2) 
//						return 1;
//					else if(i1>i2) 
//						return -1;
//					else
//						return 0;
//				}
//				).collect(Collectors.toList());
//		System.out.println(s3);
//	}
//
//}



public class SortEmployeeById {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(100);
		list.add(34);
		list.add(65);
		list.add(67);
		
		List<Integer> s=list.stream().collect(Collectors.toList());
		System.out.println(s);
		
		List<Integer> s1=list.stream().sorted().collect(Collectors.toList());
		System.out.println(s1);
		
		List<Integer> s2=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(s2);
		
		
		Comparator<Integer> c=(i1,i2)->{
			if(i1<i2) 
				return 1;
			else if(i1>i2) 
				return -1;
			else
				return 0;
		};
		List<Integer> s3=list.stream().sorted(c).collect(Collectors.toList());
		System.out.println(s3);
	}

}

