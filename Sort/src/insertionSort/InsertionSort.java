package insertionSort;
import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
//		//int []arr= {9,1,8,6,3,1,2,18};
//		for(int i=0;i<arr.length;i++) 
//		{
//			int temp=arr[i];
//			int j=i-1;
//			for(;j>=0;j--) 
//			{
//				if(arr[j]>temp) {
//					arr[j+1]=arr[j];
//				}
//				else
//					break;
//			}
//			arr[j+1]=temp;
//		}
//		for(int i=0;i<arr.length;i++)
//			System.out.print(arr[i]+" ");
		
		//Second approach//easy Approach
		for(int i=0;i<=size-2;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					//swap
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}else {
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");

	}

}
