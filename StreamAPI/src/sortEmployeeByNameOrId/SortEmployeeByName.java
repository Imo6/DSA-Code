package sortEmployeeByNameOrId;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

////Method-1
//public class SortEmployeeByName {
//	public static void main(String[] args) {
//		List<String> list=new ArrayList<>();
//		list.add("Priya");
//		list.add("Aparna");
//		list.add("Salu");
//		list.add("Sweety");
//		list.add("Nisha");
//		
//		List<String> s=list.stream().collect(Collectors.toList());
//		System.out.println(s);
//		
//		List<String> s1=list.stream().sorted().collect(Collectors.toList());
//		System.out.println(s1);
//		
//		//sorted by alphabetical order
//		List<String> s2=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
//		System.out.println(s2);
//		
//		//sorted by length
//		Comparator<String> c=(i1,i2)->{
//			int l1=i1.length();
//			int l2=i2.length();
//			if(l1<l2) 
//				return 1;
//			else if(l1>l2) 
//				return -1;
//			else 
//				return i1.compareTo(i2);//when length equal then alphabetical order
//		};
//		List<String> s3=list.stream().sorted(c).collect(Collectors.toList());
//		System.out.println(s3);
//	}
//
//}


//Method-2
public class SortEmployeeByName {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Priya");
		list.add("Aparna");
		list.add("Salu");
		list.add("Sweety");
		list.add("Nisha");
		
		List<String> s=list.stream().collect(Collectors.toList());
		System.out.println(s);
		
		List<String> s1=list.stream().sorted().collect(Collectors.toList());
		System.out.println(s1);
		
		//sorted by alphabetical order
		List<String> s2=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(s2);
		
		List<String> s3=list.stream().sorted(
				(i1,i2)->{
					int l1=i1.length();
					int l2=i2.length();
					if(l1<l2) 
						return 1;
					else if(l1>l2) 
						return -1;
					else 
						return i1.compareTo(i2);//when length equal then alphabetical order
				}
				).collect(Collectors.toList());
		System.out.println(s3);
	}

}

