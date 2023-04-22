/*import java.util.Scanner;

class MyClss
{
	public int power(int r,int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n%2==0)
			return power(r,n/2)*power(r,n/2);
		return r*power(r,n/2)*power(r,n/2);
	}
	public int order(int a)
	{
		int count=0;
		while(a>0)
		{
			count++;
			a=a/10;
		}
		return count;
	}
	public int armstrong(int num1)
	{
		int r,temp;
		int n=order(num1);
		int sum=0;
		while(num1>0)
		{
			r=num1%10;
			sum=sum+power(r,n);
			num1=num1/10;
			
		}
		return sum;
		
	}
	
}
public class ArmstrongNumber1 {

	public static void main(String[] args) {
		MyClss m=new MyClss();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int res=m.armstrong(n);
		
		if(res==n)
			System.out.println("yes");
		else
			System.out.println("no");	

	}

}
*/

import java.util.Scanner;

class MyClss
{
	public int power(int r,int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n%2==0)
			return power(r,n/2)*power(r,n/2);
		return r*power(r,n/2)*power(r,n/2);
	}
	public int order(int a)
	{
		int count=0;
		while(a>0)
		{
			count++;
			a=a/10;
		}
		return count;
	}
	public int armstrong(int num1)
	{
		int r,temp;
		int n=order(num1);
		int sum=0;
		while(num1>0)
		{
			r=num1%10;
			sum=sum+power(r,n);
			num1=num1/10;
			
		}
		return sum;
		
	}
	public void arm(int n1,int n2)
	{
		for(int i=n1;i<n2;i++)
		{
			if(armstrong(i)==i)
			{
				System.out.print(i+" ");
			}
		}
	}
	
}
public class ArmstrongNumber1 {

	public static void main(String[] args) {
		MyClss m=new MyClss();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		m.arm(n1,n2);
		
		/*if(res==n)
			System.out.println("yes");
		else
			System.out.println("no");*/	

	}

}
