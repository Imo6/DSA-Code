package gene;

public class Gene {
	public static int steadyGene(String gene) {
	    // Write your code here
	    int len=gene.length();
	    char[] ch=gene.toCharArray();
	    int countA=0;
	    int countC=0;
	    int countG=0;
	    int countT=0;
	    if(len%4==0 && gene.contains("A") && gene.contains("C") && gene.contains("G") && gene.contains("T")){
	        for(int i=0;i<ch.length;i++){
	            if(ch[i]=='A')
	            countA++;
	            if(ch[i]=='C')
	            countC++;
	            if(ch[i]=='G')
	            countG++;
	            if(ch[i]=='T')
	            countT++;
	        }
	        if(countA==countC && countC==countG && countT==countA)
	        return 1;
	    }
	    return 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Gene.steadyGene("GAACTCTGA"));;

	}

}
