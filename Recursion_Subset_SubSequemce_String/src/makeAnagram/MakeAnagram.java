package makeAnagram;

public class MakeAnagram {
	public static int makeAnagram(String a, String b) {
	    // Write your code here
	    int del=0;
	    int len_a=a.length();
	    int len_b=b.length();
	    char[] ch1=a.toCharArray();
	    char[] ch2=a.toCharArray();
	    for(int i=0;i<len_a;i++){
	        for(int j=0;j<len_a-i-1;j++){
	            if(ch1[j]>ch1[j+1]){
	                char temp=ch1[j];
	                ch1[j]=ch1[j+1];
	                ch1[j+1]=temp;
	            }
	        }
	    }
	    for(int i=0;i<len_a;i++){
	        for(int j=0;j<len_a-i-1;j++){
	            if(ch2[j]>ch2[j+1]){
	                char temp=ch2[j];
	                ch2[j]=ch2[j+1];
	                ch2[j+1]=temp;
	            }
	        }
	    }
	     
	    for(int i=0;i<a.length();i++){
	        if(ch1[i]!=ch2[i]){
	            del++;
	            del++;
	        }
	        
	    }
	    return del;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=MakeAnagram.makeAnagram("bce","cbf");
		System.out.println(res);

	}

}
