package secondHighestAndsecondSmallest;

import java.util.*;

////Highest&Lowest
//public class SecondHighestAndsecondSmallest {
//	public static List<Integer> print(int []arr,int size) {
//		int max=arr[0];
//		int min=arr[0];
//		int max_Index=0;
//		int min_Index=0;
//		List<Integer> list=new ArrayList<>();
//		for(int i=0;i<size;i++) {
//			if(arr[i]>max)//print maximum
//				max=arr[i];
//			if(arr[i]<min)//print minimum
//				min=arr[i];
//		}
//		list.add(max);
//		list.add(min);
//		return list;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int []arr= {5,10,0,2,3,4,26};
//		int size=arr.length;
//		List<Integer> list=SecondHighestAndsecondSmallest.print(arr,size);
//		System.out.println(list);
//	}
//
//}


////Second Highest & second Lowest
//public class SecondHighestAndsecondSmallest {
//	public static List<Integer> print(int []arr,int size) {
//		int second_max=0;
//		int second_min=0;
//		List<Integer> list=new ArrayList<>();
//		Arrays.sort(arr);
//		for(int i=size-1;i>0;i--) {
//			if(arr[i]!=arr[size-1])//print second maximum
//			{
//				second_max=arr[i];
//				break;
//			}
//		}
//		
//		for(int i=0;i<size;i++){
//			if(arr[i]!=arr[0])//print second minimum
//			{
//				second_min=arr[i];
//				break;
//			}
//		}
//		list.add(second_max);
//		list.add(second_min);
//		return list;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int []arr= {5,10,-20,12,2,3,4,26};
//		int size=arr.length;
//		List<Integer> list=SecondHighestAndsecondSmallest.print(arr,size);
//		System.out.println(list);
//	}
//
//}



public class SecondHighestAndsecondSmallest {
	public static List<Integer> print(int []arr,int size) {
		int max=arr[0];
		int min=arr[0];
		int second_max=0;
		int second_min=0;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<size;i++) {
			if(arr[i]>max)//print maximum
				max=arr[i];
			if(arr[i]<min)//print minimum
				min=arr[i];
		}
		Arrays.sort(arr);
		for(int i=size-1;i>0;i--) {
			if(arr[i]!=max)//print second maximum
			{
				second_max=arr[i];
				break;
			}
		}
		
		for(int i=0;i<size;i++){
			if(arr[i]!=min)//print second minimum
			{
				second_min=arr[i];
				break;
			}
		}
		list.add(second_max);
		list.add(second_min);
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {5,10,-20,12,2,-3,3,4,26};
		int size=arr.length;
		List<Integer> list=SecondHighestAndsecondSmallest.print(arr,size);
		System.out.println(list);
	}

}


