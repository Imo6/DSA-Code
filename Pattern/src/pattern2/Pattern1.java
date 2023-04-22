package pattern2;

import java.util.Scanner;

//public class Pattern1 {
//	public static void main(String[] args)
//	{
//		System.out.println("Enter the row");
//		Scanner sc=new Scanner(System.in);
//		int N=sc.nextInt();
//		
//		for(int row=0;row<2*N;row++)
//		{
//			int totalColinRow=row>N?2*N-row:row;
//			for(int col=0;col<totalColinRow;col++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//	}  
//
//}


////Method1
//public class Pattern1 {
//	public static void main(String[] args)
//	{
//		System.out.println("Enter the row");
//		Scanner sc=new Scanner(System.in);
//		int N=sc.nextInt();
//		
//		for(int row=0;row<2*N;row++)
//		{
//			int no_of_space=N>row?(N-row):(-(N-row));
//			for(int space=0;space<no_of_space;space++)
//			{
//				System.out.print(" ");
//			}
//			int totalColinRow=row>N?2*N-row:row;
//			for(int col=0;col<totalColinRow;col++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}	
//	}  
//}


////Method2
//public class Pattern1 {
//	public static void main(String[] args)
//	{
//		System.out.println("Enter the row");
//		Scanner sc=new Scanner(System.in);
//		int N=sc.nextInt();
//		
//		for(int row=0;row<2*N;row++)
//		{
//			int totalColinRow=row>N?2*N-row:row;
//			int no_of_space=N-totalColinRow;
//			for(int space=0;space<no_of_space;space++)
//			{
//				System.out.print(" ");
//			}
//
//			for(int col=0;col<totalColinRow;col++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}	
//	}  
//}



public class Pattern1 {
	public static void main(String[] args)
	{
		System.out.println("Enter the row");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int row=1;row<=2*N;row++)
		{
			int totalColinRow=row>N?2*N-row-1:row;
			int no_of_space=N-totalColinRow;
			for(int space=0;space<no_of_space;space++)
			{
				System.out.print(" ");
			}

			for(int col=row;col<totalColinRow;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}	
	}  
}


