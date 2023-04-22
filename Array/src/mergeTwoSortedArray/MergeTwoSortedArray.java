package mergeTwoSortedArray;
import java.util.*;

public class MergeTwoSortedArray {
	public static ArrayList<Integer> merge(int[] nums1,int[] nums2) {
		int i=0,j=0;
		ArrayList<Integer> list=new ArrayList<>();
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<nums2[j]) {
				list.add(nums1[i++]);
			}else if(nums1[i]>nums2[j]) {
				list.add(nums2[j++]);
			}else {
				list.add(nums1[i++]);
				j++;
			}
		}
		while(i<nums1.length ) {
			list.add(nums1[i++]);
		}
		while( j<nums2.length) {
			list.add(nums2[j++]);
		}
		return list;
	}
	public static void main(String []args) {
		int []nums1 = {1,2,3,8,89};
		int []nums2 = {2,5,6};
		ArrayList<Integer> list=MergeTwoSortedArray.merge(nums1,nums2);
		System.out.println(list);
	}

}


/*
//In LeetCode this code works fine
public class MergeTwoSortedArray {
	public static void merge(int[] nums1,int m,int[] nums2,int n) {
		int i=m-1,j=n-1;
		int k=nums1.length-1;
		
		while(j>=0) {
			if(i>=0 && nums1[i]>nums1[j]) {
				nums1[k]=nums1[i];
				i--;
				k--;
			}else {
				nums1[k]=nums1[j];
				k--;
				j--;
			}
		}
		
	}
	public static void main(String []args) {
		int []nums1 = {1,2,3,8,89};
		int []nums2 = {0,2,5,6};
	MergeTwoSortedArray.merge(nums1,5,nums2,3);
	}

}
*/
