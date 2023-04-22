package package2;

//leetCode Hard Problem
public class SplitArray_LargestSum {
	    public static int splitArray(int[] nums, int k) {
	      int start=0;
			int end=0;
			for(int i=0;i<nums.length;i++) 
	        {
				start=Math.max(start,nums[i]);
				end+=nums[i];
			}
			
			while(start<end) 
			{
				int mid=start+(end-start)/2;
				
				int sum=0;
				int pieces=1;
				for(int num:nums) 
				{
					if(sum+num >mid) 
					{
						sum=num;
						pieces++;
					}
					else 
					{
						sum+=num;
					}
				}
				if(pieces<=k) 
				{
					end=mid;
				}
				else 
				{
					start=mid+1;
				}
			}
			return end;
			
		} 
	public static void main(String[] args) {
		int []arr= {7,2,5,10,8};
		int m=2;
		int res=SplitArray_LargestSum.splitArray(arr,m);
		System.out.println(res);
		
	}
}

