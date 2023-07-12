package RepeatedString;

//public class RepeatedString {
//	public static int myString(String s,int k)
//	{
//		int len=s.length();
//		int q=k/len;
//		int r=k%len;
//		int t=(r==0)? 0:r;
//		int acount=q * countfun(s,len)+countfun(s,t);
//		return acount;
//			
//	}
//    public static int countfun(String s,int t)
//	{
//    	int count=0;
//    	for(int i=0;i<s.length()-1;i++)
//		{
//			if(s.charAt(i)=='a')
//				count++;
//		}
//		return count;
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str="abc";
//		int k=20;
//		int res=myString(str,k);
//		System.out.println(res);
//
//	}
//
//}


//public class RepeatedString {
//	public static int myString(String s,int k)
//	{
//		int acount=0;
//		char[]ch=s.toCharArray();
//		for(int i=0;i<s.length();i++) {
//			if(ch[i] =='a')
//				acount++;
//		}
//		
//		int q=k/s.length();
//		int r=k%s.length();
//		int newacount=q*acount;
//		String sub=s.substring(0,r);
//		char[]ch1=sub.toCharArray();
//		for(int i=0;i<sub.length();i++) {
//			if(ch1[i]=='a')
//				newacount++;
//		}
//		
//		return newacount;
//	}	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str="abc";
//		int k=10;
//		int res=myString(str,k);
//		System.out.println(res);
//
//	}
//
//}



public class RepeatedString {
	public static int repeatedString(String str,int n){
        int len=str.length();
        int temp_len=n/len;
        int len1=n-len*temp_len;
        int count=0;
        String str1=str.substring(0,len1+1);
        for(int i=0;i<str1.length()-1;i++){
            if(str1.charAt(i)=='m') count++; 
        }
        return (temp_len+count);
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="imran";
        int n=20;
        int res=repeatedString(str,n);
        System.out.println(res);
		

	}

}


