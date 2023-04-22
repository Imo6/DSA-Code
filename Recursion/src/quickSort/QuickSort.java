package quickSort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int []arr= {5,4,3,2,1};
		QuickSort.sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void sort(int []arr,int low,int high) {
		
		int s=low;
		int e=high;
		int mid=s+(e-s)/2;
		int pivot=arr[mid];
		if(s>=e)
			return;
		
		while(s<=e) {
			while(arr[s]<pivot)
				s++;
			while(arr[e]>pivot)
				e--;
			
			//otherwise swap the element
			if(s<=e) {
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		//sort the left and right part of pivot
		//function call
		sort(arr,low,e);
		sort(arr,s,high);
	}
	

}
