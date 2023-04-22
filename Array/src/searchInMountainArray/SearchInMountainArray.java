package searchInMountainArray;
//
////peak index
//public class SearchInMountainArray {
//	public static int peakInMountain(int[]arr) {
//		int s=0;
//		int e=arr.length-1;
//		int mid=(s+e)/2;
//		while(s<e) {
//			if(arr[mid]>arr[mid+1])
//				e=mid;
//			else
//				s=mid+1;
//			mid=(s+e)/2;
//			
//		}
//		return s;
//	}
//
//	public static void main(String[] args) {
//		int []arr= {0,1,2,3,4,5,3,1,0};
//		int res=SearchInMountainArray.peakInMountain(arr);
//		System.out.println(res);
// 
//	}
//
//}




//peak index
public class SearchInMountainArray {
	public static int peakInMountain(int[]arr,int key) {
		int peakIndex=serachPeakIndex(arr);
		
		if(arr[peakIndex]==key)
			return peakIndex;
		int s=0;
		int s1=s;
		int peakIndex1=peakIndex;
		
		//search in right part
		while(s1<peakIndex) {
			int mid=(s1+peakIndex1)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				peakIndex1=mid-1;
			else
				s1=peakIndex1+1;
				
		}
		
		//search in left part
		int e=arr.length-1;
		while(e>peakIndex) {
			int mid=(e+peakIndex)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				e=mid-1;
			else
				s=peakIndex+1;
				
		}
		
		return -1;
	}
	
	public static int serachPeakIndex(int []arr) {
		int s=0;
		int e=arr.length-1;
		while(s<e) {
			int mid=(s+e)/2;
			if(arr[mid]<arr[mid+1])
				s=mid+1;
			else
				e=mid;
			
		}
		return s;
	}

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,3,1};
		int key=5;
		int res=SearchInMountainArray.peakInMountain(arr,key);
		System.out.println(res);

	}

}

