package SelectionSort;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		
		int []arr= {0 ,7,4,0,5,3,7,1};
		for(int sel=0;sel<arr.length;sel++)
		{
			 int min_idx = sel;
			for(int pos=sel+1;pos<arr.length;pos++)
			{
				if(arr[pos]<arr[min_idx]) {
					 min_idx = sel;
					int temp=arr[min_idx];
					arr[min_idx]=arr[pos];
					arr[pos]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
