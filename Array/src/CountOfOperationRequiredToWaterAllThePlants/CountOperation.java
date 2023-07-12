package CountOfOperationRequiredToWaterAllThePlants;

public class CountOperation {
	public static int countFun(int []arr,int k) {
		int count=0;
		int cur_cap=k;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>k)
				return -1;
			if(arr[i]<cur_cap) {
				count++;
				cur_cap-=arr[i];
			}
			else {
				count+=2*i+1;
				cur_cap=k-arr[i];
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		int []arr= {2,2,3,3};
		int k=5;
		int res=CountOperation.countFun(arr,k);
		System.out.println(res);

	}

}
