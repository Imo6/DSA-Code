import java.util.*;
public class Tripltes {
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list=new ArrayList<>();
        Integer[] arr1=new Integer[a.size()];
        a.toArray(arr1);
        Integer[] arr2=new Integer[b.size()];
        b.toArray(arr2);
        int[] arr3=new int[arr1.length];
        int[] arr4=new int[arr2.length];
        
        int s=0;
        for(int i=0;i<a.size();i++){
            if(arr1[i] > arr2[i])
            arr3[i]++;
            else if(arr1[i] < arr2[i])
            	 arr4[i]++;
            else if(arr1[i] == arr2[i])
            s=0;
        }
       int sum1=0;
       int sum2=0;
       for(int i:arr3)
       sum1+=i;
       for(int i:arr4)
       sum2+=i;
       
       System.out.println(sum1);
       System.out.println(sum2);
       list.add(sum1);
       list.add(sum2);
       return list;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=Arrays.asList(11,23,21);
		List<Integer> b=Arrays.asList(10,236,2);
		List<Integer> res=Tripltes.compareTriplets(a,b);
		System.out.println(res);

	}

}
