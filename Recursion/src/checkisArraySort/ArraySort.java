package checkisArraySort;

import java.util.ArrayList;
import java.util.List;

public class ArraySort {
	public static boolean find(int [] arr,int target,int index)
	{
		if(index==arr.length)
			return false;
		else
			return arr[index]==target || find(arr,target,index+1);
	}
	
	public static int findIndex(int [] arr,int target,int index)
	{
		if(index==arr.length)
			return -1;
		if(arr[index]==target)
			return index;
		return  findIndex(arr,target,index+1);
	}
	
	public static int findLast(int [] arr,int target,int index)
	{
		if(index==-1)
			return -1;
		if(arr[index]==target)
			return index;
		return  findIndex(arr,target,index-1);
	}
	
	//method1//this will be return all index when array contain duplicate entry
	static ArrayList<Integer> list=new ArrayList<>();
	public static void findAllIndex(int [] arr,int target,int index)
	{
		if(index==arr.length)
			return;
		if(arr[index]==target)
			list.add(index);
		findAllIndex(arr,target,index+1);
	}
	
	//method1//this will be return all index when array contain duplicate entry
	public static ArrayList<Integer> findAllIndex1(int [] arr,int target,int index,ArrayList<Integer> list )
	{
		if(index==arr.length)
			return list;
		if(arr[index]==target)
			list.add(index);
		return findAllIndex1(arr,target,index+1,list);
	}

	public static void main(String[] args) {
		int []arr= {2,3,1,4,4,5};
//		System.out.println(ArraySort.find(arr, 4,0));
//		System.out.println(ArraySort.findIndex(arr, 4,0));
//		System.out.println(ArraySort.findLast (arr, 4,arr.length-1));
//		findAllIndex(arr, 4,0);
//		System.out.print(list);
		findAllIndex1(arr, 4,0,list);
		System.out.print(list);
		
//		System.out.println(ArraySort.find(arr, 14,0));
//		System.out.println(ArraySort.findIndex(arr, 14,0));
//		System.out.println(ArraySort.findLast (arr, 14,arr.length-1));

	}

}
