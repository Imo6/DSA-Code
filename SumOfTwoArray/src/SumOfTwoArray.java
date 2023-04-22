import java.io.*;
class SumOfTwoArray {
	public static void main(String[] args)
	{
		int a[] = { 9, 3, 9 };
	    int b[] = { 6, 1 };
		
		int n = a.length;
		int m = b.length;
		
		int []sum=new int[n > m ? n:m];
		int carry=0;
		int i=n-1;
		int j=m-1;
		int k=sum.length-1;
		while(k>=0)
		{
			int digit=carry;
			
			if(i>=0)
				digit+=a[i];
			if(j>=0)
			   digit+=b[j];
			
			carry=digit/10;
			digit=digit%10;
			sum[k]=digit;
			i--;
			j--;
			k--;
			
		}
		if(carry!=0)
			System.out.println(carry);
		
		for(int val:sum)
			System.out.println(val);
		
		
	}
}

