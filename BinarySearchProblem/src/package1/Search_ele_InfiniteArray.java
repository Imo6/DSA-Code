package package1;

//o/p comes but index lesser than actual index by 1????
public class Search_ele_InfiniteArray {
	public static int ans(int []a,int target) {
		int s=0;
		int e=1;
		
		while(target>a[e]) {
			int new_s=e+1;
			e=e+(e-s+1)*2;
			s=new_s;
		}
		return BinarySerach(a,target,s,e );
	}
	public static int BinarySerach(int []a,int target,int s,int e ) {
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(target>a[mid])
				return s=mid+1;
			else if(target<a[mid])
				return e=mid-1;
			else
				return mid;
		}
		return -1;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []a= {3,5,7,9,10,90,100,130,140,160,170};
		int []a= {1,2,3,5,7,9,10,11};
		int target=10;
		int res=Search_ele_InfiniteArray.ans(a,target);
		System.out.println(res);
	}

}
