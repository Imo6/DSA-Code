//
//class MyClass
//{
//	public void sort(int []a)
//	{
//		int low=0;
//		int mid=0;
//		int high=a.length-1;
//		while(mid<=high)
//		{
//			if(a[mid]==0)
//			{
//				int temp=a[low];
//				a[low]=a[mid];
//				a[mid]=temp;
//				low++;
//				mid++;
//			}
//			else if(a[mid]==1)
//			{
//				mid++;
//			}
//			else if(a[mid]==2)
//			{
//				int temp=a[mid];
//				a[mid]=a[high];
//				a[high]=temp;
//				high--;
//			}
//		}
//		//code studio this for loop not needed
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//	}
//	
//}
//
//public class Sort_0_1_2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MyClass m=new MyClass();
//		int []arr= {0,2,2,1,0,1,1,0,2,1};
//		m.sort(arr);
//		
//
//	}
//
//}



