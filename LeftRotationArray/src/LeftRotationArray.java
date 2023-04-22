
public class LeftRotationArray {
	
	public int[] myArray(int []arr,int k)
	{
		int len=arr.length;
		int [] temp=new int[len];
		for(int i=0;i<len;i++)
		{
			temp[i]=arr[(i+k)%len];
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeftRotationArray obj=new LeftRotationArray();
		int []arr= {1,2,3,4,5};
		int [] res=obj.myArray(arr, 1);
		for(int i=0;i<arr.length;i++)
			System.out.print(res[i]+" ");

	}

}
