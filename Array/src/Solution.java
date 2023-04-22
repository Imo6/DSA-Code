
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		int nums[]= {1,7,9,11};
		int k=2;
		System.out.println(Solution.rotate(nums, k));;

	}
	public static int[] rotate(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        for(int m=0;m<k;m++){
            //swap
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return nums;
	}
}
