

import java.util.ArrayList;
import java.util.List;

public class First_Missing_positive {
	public static int FirstPositive(int []a) {
		int i=0;
		while(i<a.length)
		{
			int correctIndex=a[i]-1;
			if(a[i]>0 && a[i]<a.length && a[i]!=a[correctIndex]) {
				//swap
				int temp=a[i];
				a[i]=a[correctIndex];
				a[correctIndex]=temp;
			}
			else
				i++;
		}
		//Search for first Missing Number
		for(int Index=0;Index<a.length;Index++) {
			if(a[Index]!=Index+1) {
				return Index+1;
			
			}
		}
		return a.length+1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a= {7,8,9,12,11};
		//int []a= {1,3,4,2};
		//int []a= {3,4,-1,1};
		int []a= {1,0,2};
		int num=First_Missing_positive.FirstPositive(a);
	    System.out.println(num);

	}

}


