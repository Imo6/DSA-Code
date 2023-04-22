import java.util.Scanner;

class MyClass
{
	public void reverseArray(int []arr)
	{
		int i=0,temp;
		int j=arr.length-1;
		while(j>=i)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<arr.length;k++)
			System.out.print(arr[k]+" ");
		
	}
}

public class ReverseArray1 {

	public static void main(String[] args) {
		MyClass m=new MyClass();
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}*/
		int []arr= {1,2,3,4,5,4};
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		m.reverseArray(arr);
	}

}
