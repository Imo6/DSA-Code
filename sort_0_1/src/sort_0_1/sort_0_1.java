//package sort_0_1;
//
//
//class MyClass
//{
//	public void sort(int[]arr)
//	{
//		int low=0;
//		int high=arr.length-1;
//		while(low>=high)
//		{
//			if(arr[low]==0)
//				{ low++; }
//			if(arr[high]==1)
//				{ high--; }
//			if(arr[high]==0 && arr[low]==1)
//			{
//				int temp=arr[high];
//				arr[high]=arr[low];
//				arr[low]=temp;
//				low++;
//				high--;
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//	}
//}
//public class sort_0_1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MyClass m=new MyClass();
//		int []arr= {0,1,1,1,0,1,1,0,0,1};
//		m.sort(arr);
//
//	}
//
//}



