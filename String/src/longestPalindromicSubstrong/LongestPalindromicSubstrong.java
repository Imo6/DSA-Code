package longestPalindromicSubstrong;

public class LongestPalindromicSubstrong {
	public static int printLength(String s) {
		boolean [][]dp=new boolean[s.length()][s.length()];
		String ans="";
		int count =0;
		for(int gap=0;gap<s.length();gap++) {
			for(int i=0,j=gap;j<s.length();i++,j++) {
				if(gap==0) {
					dp[i][j]=true;
				}
				else if(gap==1) {
					if(s.charAt(i)==s.charAt(j)) {
						dp[i][j]=true;
						//maxLength=2;
					}
					else
						dp[i][j]=false;
				}
				else {
					if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true) {
						dp[i][j]=true;
					}
					else
						dp[i][j]=false;
				}
			   if (dp[i][j]==true && count<s.substring(i,j+1).length()) {	 
					 ans=s.substring(i,j+1);//longest substring
                     count=ans.length();//length of longest substring
                }
//				if(dp[i][j]) {
//					count=gap+1;
//				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s="abccbc";
		int res=LongestPalindromicSubstrong.printLength(s);
		System.out.println(res);

	}

}
