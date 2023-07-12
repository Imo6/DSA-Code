package hcf;

public class FinfHcf {
	public static int myfun(int a,int b) {
			
		int hcf=1;
		int limit=a>b?b:a;
		for(int i=1;i<=limit;i++) {
			if(a%i==0 && b%i==0)
				hcf=i;
		}

		return hcf;
	}

	public static void main(String[] args) {
		System.out.println(FinfHcf.myfun(24,8));
		
		//String str="Abhinav loves dipika";
		String[] arr="Abhinav loves dipika".split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
