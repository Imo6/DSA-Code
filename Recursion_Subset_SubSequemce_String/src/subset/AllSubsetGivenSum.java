package subset;

	import java.util.ArrayList;
	import java.util.Collections;
import java.util.*;

	public class AllSubsetGivenSum {
		public static int countNumberOfSubarrays(List<Integer> arr, int k) {
		    // Write your code here
		     Map<Integer, Integer> map = new HashMap<>();
		        int sum = 0;
		        int count = 0;

		        for (int num : arr) {
		            sum += num;

		            if (sum == k) {
		                count++;
		            }

		            if (map.containsKey(sum - k)) {
		                count += map.get(sum - k);
		            }

		            map.put(sum, map.getOrDefault(sum, 0) + 1);
		        }

		        return count;

		    }

		public static void main(String[] args) {
//			List<Integer> list=Arrays.asList(1,2,3);
//			int k=3;
			List<Integer> list=Arrays.asList(10, 2, -2, -20, 10);
			int k=-10;
			int count=AllSubsetGivenSum.countNumberOfSubarrays(list, k);
			System.out.println(count);
		}

	}
