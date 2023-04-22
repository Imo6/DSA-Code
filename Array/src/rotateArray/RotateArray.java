package rotateArray;

public class RotateArray {
	public static int[] rotate(int[] nums, int k) {
		
		int n=nums.length;
        int[]temp=new int[nums.length];
        for(int i=0;i<nums.length;i++) {
        	temp[(i+k)%n]=nums[i];
        }
        return temp;
	}
	public static void main(String[]args) {
		int []nums= {1,3,4,7,9,11}; 
		int k=2;
		int []Rarr=RotateArray.rotate(nums, k);
		for(int i=0;i<nums.length;i++) {
        	System.out.print(Rarr[i]+" ");
        }
		
	}

}
