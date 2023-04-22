package package2;

public class SqrInBinarySearch {
	public static int sqr(int num) {
		
		int ans=-1;
		int s=0;
		int e=num;
		int mid=(s+e)/2;
		while(s<=e) {
			if(mid*mid>num) {
				e=mid-1;
			}else if(mid*mid<num) {
				ans=mid;
				s=mid+1;
			}else {
				return mid;
			}
			mid=(s+e)/2;
		}
		
		return ans; 
	}
	
	public static double sqrMorePrecision(int num,int precision,int tempsol) {
		
		double factor=1;
		double ans=tempsol;
		for(int i=0;i<precision;i++) {
			factor=factor/10;
			for(double j=ans;j*j<num;j+=factor) {
				ans=j;
			}
		}
		return ans;
	}
	
	public static void main(String []args) {
		int num=2;
		int tempsol=SqrInBinarySearch.sqr(num);
		double res=sqrMorePrecision(num,3,tempsol);
		System.out.println(res);
		
	}

}
