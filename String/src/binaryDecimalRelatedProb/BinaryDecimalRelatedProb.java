package binaryDecimalRelatedProb;
import java.util.*;
public class BinaryDecimalRelatedProb {
	public static void binary(String s,int y) {
		int num=Integer.valueOf(s);
		int n=1;
		int sum=0;
		while(num>0) {
			int r1=num%10;
			sum+=r1*n;
			num/=10;
			n*=2;
		}
		System.out.println(sum);
		int num1=sum;
		int place=1;
		int sum1=0;
		while(num1>0) {
			int rem=num1%2;
			sum1+=rem*place;
			num1/=2;
			place*=10;
		}
		System.out.println(sum1);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryDecimalRelatedProb.binary("100",2);

	}

}
