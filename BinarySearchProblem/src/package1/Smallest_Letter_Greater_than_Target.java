
package package1;

public class Smallest_Letter_Greater_than_Target {
	public static char Ceiling(char []a,char key) {
		int len=a.length;
		int s=0;
		int e=len-1;
		while(s<=e) {
			int mid=s+(e-s)/2;
			if(a[mid]==key)
				return key;
			else if(key>a[mid])
				s=mid+1;
			else
				e=mid-1;
		}
		return a[s%len];//Only Change in Binary code //this line
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []a= {1,2,4,5,6,9,11,15,19};
//		char []a= {'a','b'};
		char []a= {'c','f','j'};
		char res=Smallest_Letter_Greater_than_Target.Ceiling(a,'d');
		System.out.println(res);


	}

}


