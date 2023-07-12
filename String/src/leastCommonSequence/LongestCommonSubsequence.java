package leastCommonSequence;

//public class LeastCommonSequence {
//	public static int[][] LCS3(String s1[],String s2[],int m,int n) {
//		
//		int [][]memo=new int[m+1][n+1];
//		for(int i=0;i<=m;i++) {
//			for(int j=0;j<=n;j++) {
//				if(i==0 || j==0)
//					memo[i][j]=0;
//				else if(arr1[i-1]==arr2[j-1])
//					return 1+memo[i-1][j-1]);
//				else
//					Math.max(memo[i-1][j],memo[i][j-1]);
//			}
//		}
//		return memo;
//	}
//
//	public static void main(String[] args) {
//		String s1="JAVAAID";
//		String s2="JAVAID";
//		
//		char []arr1=s1.toCharArray();
//		char []arr2=s2.toCharArray();
//		System.out.println(LeastCommonSequence.LCS3(s1,s2,s1.length(),s2.length()));;
//		
//		
//
//	}
//
//}



public class LongestCommonSubsequence {

	// Returns length of LCS for X[0..m-1], Y[0..n-1]
	int lcs(String X, String Y, int m, int n)
	{
		
		if (m == 0 || n == 0)
			return 0;
		if (X.charAt(m - 1) == Y.charAt(n - 1)) 
		{
			return 1 + lcs(X, Y, m - 1, n - 1);
		}
		else 
		{
			return max(lcs(X, Y, m, n - 1),lcs(X, Y, m - 1, n));
		}
	}

	// Utility function to get max of 2 integers
	int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// Driver code
	public static void main(String[] args)
	{
		LongestCommonSubsequence lcs
			= new LongestCommonSubsequence();
		String S1 = "AGGTAB";
		String S2 = "GXTXAYB";
		int m = S1.length();
		int n = S2.length();

		System.out.println("Length of LCS is"
						+ " " + lcs.lcs(S1, S2, m, n));
	}
}

//This Code is Contributed by Saket Kumar
