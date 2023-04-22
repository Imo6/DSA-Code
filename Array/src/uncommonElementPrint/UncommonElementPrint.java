package uncommonElementPrint;

import java.util.ArrayList;

public class UncommonElementPrint {

	public static void main(String[] args) {
		int []arr1= {1,3,4,5};
		int []arr2= {2,3,4,7,9};
		ArrayList<Integer> arr3=new ArrayList<>();
		
		int len1=arr1.length;
		int len2=arr2.length;
		int i=0,j=0;
		
		while(i<len1 & j<len2) {
				if(arr1[i]==arr2[j]) {
						i++;
						j++;
				}
				else if(arr1[i]>arr2[j])
					arr3.add(arr2[j++]);
				else
					arr3.add(arr1[i++]);
			}
		while(i<len1)
			arr3.add(arr2[i++]);
		
		while(j<len2)
			arr3.add(arr2[j++]);
		
		System.out.print(arr3);
	}

}

