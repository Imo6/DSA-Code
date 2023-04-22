
package package1;

public class findfloor {
	public static int Ceiling(int []a,int key) {
		int len=a.length;
		int s=0;
		int e=len-1;
		int mid=s+(e-s)/2;
		while(s<=e) {
			if(a[mid]==key)
				return key;
			else if(key>a[mid])
				s=mid+1;
			else
				e=mid-1;
			mid=s+(e-s)/2;	
		}
		return a[e];//Only Change in Binary code //this line
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []a= {1,2,4,5,6,9,11,15,19};
		int []a= {2,3,5,9,14,16,18};
		int res=findfloor.Ceiling(a,15);
		System.out.println(res);


	}

}

