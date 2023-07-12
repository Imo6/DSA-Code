package bannedCustomer;

public class BannedCustomer {
	public static void customerCount(int[] arr1,int n,int[] arr2,int m) {
		int lim=n>=m?n:m;
		int lim1=n>=m?m:n;
		int count=0;
		for(int i=0;i<lim;i++) {
			for(int j=0;j<lim1;j++) {
				if(arr1[i]==arr2[j])
					count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {1,3,2,4,5};
		int[]arr2= {3,4,6,2,7,8};
		BannedCustomer.customerCount(arr1,5,arr2,4);

	}

}
