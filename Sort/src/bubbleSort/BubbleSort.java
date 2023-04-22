package bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				//Scanner sc=new Scanner(System.in);
				
				//int []arr= {0,7,4,5,3,1};
				int []arr= {3,4,5,8,11,3,24,-9};
				for(int i=0;i<arr.length-1;i++)
				{
					boolean swapped=false;//Optimization for already sorted Array
					//Because last ele are allready sorted 
					for(int j=0;j<arr.length-i-1;j++)
					{
						if(arr[j]>arr[j+1]) {
							int temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
							//swapped=true;
						}
					}
					if(swapped==false)
						break;
				}
				for(int j=0;j<arr.length-1;j++)
					System.out.print(arr[j]+" ");

			}

		}
