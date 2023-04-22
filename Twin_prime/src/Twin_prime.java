
import java.util.Scanner;

public class Twin_prime {
	public static void twinprime(int num1,int num2)
	{
		int hcf=0;
		if(num2>num1) {
			for(int i=1;i<=num1;i++) {
				if(num1%i==0 && num2%i==0 && (num2-num1)==2)
					hcf=i;
			}
			if(hcf==1)
				System.out.println("Twin-prime number");
			else
				System.out.println("not");
		}
		else {
			for(int i=1;i<=num1;i++) {
				if(num1%i==0 && num2%i==0 && (num1-num2)==2)
					hcf=i;
			}
			if(hcf==1)
				System.out.println("Twin-prime number");
			else
				System.out.println("not");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 and num2");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		Twin_prime.twinprime(num1,num2);

	}

}

