package totalPalindromicSubstrong;

public class totalPalindromicSubstrong {
	public static int printLength(String s) {
		boolean [][]dp=new boolean[s.length()][s.length()];
		int count=0;
		for(int gap=0;gap<s.length();gap++) {
			for(int i=0,j=gap;j<s.length();i++,j++) {
				if(gap==0) {
					dp[i][j]=true;
				}
				else if(gap==1) {
					if(s.charAt(i)==s.charAt(j))
						dp[i][j]=true;
					else
						dp[i][j]=false;
				}
				else {
					if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true)
						dp[i][j]=true;
					else
						dp[i][j]=false;
				}
				
				if(dp[i][j])
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abccb";
		int res=totalPalindromicSubstrong.printLength(s);
		System.out.println(res);
	}

}
