package checkisArraySort;

public class pattern1 {

	public static void main(String[] args) {
		pattern1.fun1(5,0);

	}
//	public static void fun(int r,int c) {
//		if(r==0)
//			return;
//		if(r>c) {
//			System.out.print("*"+" ");
//			fun(r,c+1);
//		}else {
//			System.out.println();
//			fun(r-1,0);
//		}
//		
//	}
	
	public static void fun1(int r,int c) {
		if(r==0)
			return;
		if(r>c) {

			fun1(r,c+1);
			System.out.print("*"+" ");
		}else {
			fun1(r-1,0);
			System.out.println();
		}
		
	}

}
