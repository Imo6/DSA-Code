import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class SingletonClass {
	/*private static SingletonClass s=new SingletonClass();
	
	//private ctor
	private SingletonClass() {
		
	}
	
	public static SingletonClass getSingleton() {
		return s;
	}*/
	
	//Method 2
	private static SingletonClass s=null;
	//private ctor
		private SingletonClass() {
			
		}
		public static SingletonClass getSingleton() {
			if(s==null) {
				return s=new SingletonClass();
			}
			return s;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass s1=SingletonClass.getSingleton();
		SingletonClass s2=SingletonClass.getSingleton();
		SingletonClass s3=SingletonClass.getSingleton();
		SingletonClass s4=SingletonClass.getSingleton();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
//		
//		String ss1=new String("Imran");
//		String ss2=ss1;
//		System.out.println(ss1==ss2);//true
//		System.out.println(ss1.equals(ss2));
		
//		String ss1="Imran";
//		String ss2=ss1;
//		System.out.println(ss1==ss2);//true
//		System.out.println(ss1.equals(ss2));
		
//		String ss1=new String("Imran");
//		String ss2=new String("Imran");
//		System.out.println(ss1==ss2);//flase
//		System.out.println(ss1.equals(ss2));
		
//		String ss1=new String("Imran");
//		String ss2="Imran";
//		System.out.println(ss1==ss2);//flase
//		System.out.println(ss1.equals(ss2));
		
//		String ss1="Imran";
//		String ss2=ss1;
//		System.out.println(ss1==ss2);//true
//		System.out.println(ss1.equals(ss2));//true
		

	}
}
