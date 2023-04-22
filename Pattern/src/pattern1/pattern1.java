package pattern1;

//public class pattern1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int n=5;
//		for(int row=0;row<2*n;row++)
//		{
//			int totalColinRow=row>n?2*n-row:row;
//			for(int col=0;col<totalColinRow;col++)
//				 System.out.print("* ");
//			System.out.println();	
//		}
//
//	}
//
//}

//public class pattern1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int n=5;
//		for(int row=0;row<2*n;row++)
//		{
//			int totalColinRow=row>n?2*n-row:row;
//			for(int space=0;space<n-totalColinRow;space++)
//				System.out.print(" ");
//			for(int col=0;col<totalColinRow;col++)
//				 System.out.print("* ");
//			System.out.println();	
//		}
//
//	}
//
//} 






public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int row=0;row<2*n;row++)
		{
			int totalColinRow=row>n?2*n-row:row;
			for(int space=0;space<n-totalColinRow;space++)
				System.out.print(" ");
			
			for(int col=totalColinRow;col>=1;col--) {
				 System.out.print(col);		
			}
			for(int col=2;col<=totalColinRow;col++) {
				 System.out.print(col);		
			}
			System.out.println();	
		}

	}

} 

