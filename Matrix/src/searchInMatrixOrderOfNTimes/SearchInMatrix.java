package searchInMatrixOrderOfNTimes;
import java.util.*;

//method-1
public class SearchInMatrix {
	public static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
	}

	public static void main(String[] args) {
		int[][] matrix= {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,38,50}
				
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter target element");
		int target=sc.nextInt();
		String b=Arrays.toString(SearchInMatrix.search(matrix,target));
		System.out.println(b);

	}

}

////method-2
//public class SearchInMatrix {
//	public static boolean search(int [][]matrix,int target) {
//		int r=0;
//		int c=matrix[0].length-1;
//		while(r<matrix.length && c>=0) {
//			if(target==matrix[r][c])
//				return true;
//			else if(target>matrix[r][c])
//				r++;
//			else
//				c--;
//		}
//		return false;
//	}
//	public static void main(String[] args) {
//		int[][] matrix= {
//				{10,20,30,40},
//				{15,25,35,45},
//				{28,29,37,49},
//				{33,34,38,50}
//				
//		};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter target element");
//		int target=sc.nextInt();
//		boolean b=SearchInMatrix.search(matrix,target);
//		System.out.println(b);
//
//	}
//
//}
//
