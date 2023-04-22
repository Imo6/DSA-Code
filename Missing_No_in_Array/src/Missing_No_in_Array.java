

//Time complexity must be less or equal to o(n) 
public class Missing_No_in_Array {
	
	public static int MisiingNumber(int a[]) {
		int i=0;
		while(i<a.length)
		{
			int correctIndex=a[i];
			if(a[i]<a.length && a[i]!=a[correctIndex]) {
				//swap
				int temp=a[i];
				a[i]=a[correctIndex];
				a[correctIndex]=temp;
			}
			else {
				i++;
			}
		}
		//Search for first Missing Number
		for(int Index=0;Index<a.length;Index++) {
			if(a[Index]!=Index)
				return Index;
		}
		//When N is not present in Array
		return a.length;
		
	}
	public static void main(String[] args) {
//		int []a= {4,0,1,2,5};
		int []a= {4,0,5,1,2,3};
		int res=MisiingNumber(a);
		System.out.println(res);
	}

}
