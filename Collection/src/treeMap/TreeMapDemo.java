package treeMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

//public class TreeMapDemo {
//
//	public static void main(String[] args) {
//		TreeMap t=new TreeMap();
//		t.put("A", 12);
//		t.put("a", null);
//		t.put("B", null);
//		t.put("E", 13);
//		//t.put(10, null);//ClassCastException
//        //t.put(null, 78);//NullPointerException
//		System.out.println(t);
//
//	}
//
//}


// public class TreeMapDemo implements Comparator {
//		 public int compare(Object ob1,Object ob2) {
//			 String s1=ob1.toString();
//			 String s2=ob2.toString();
////			 return s2.compareTo(s1);
//			 return -s1.compareTo(s2);
//		 }
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method staus
//		
//		TreeMapDemo tm=new TreeMapDemo();
//		TreeMap t=new TreeMap(tm);
//		t.put("A", 12);
//		t.put("a", null);
//		t.put("B", null);
//		t.put("E", 13);
//		//t.put(10, null);//ClassCastException
//        //t.put(null, 78);//NullPointerException
//		System.out.println(t);
//
//	}
//
//}


public class TreeMapDemo implements Comparator {
	 public int compare(Object ob1,Object ob2) {
		 //1st way
		 Integer i1=(Integer)ob1;
		 Integer i2=(Integer)ob2;
		 return i2.compareTo(i1);
		 
//		 //2nd way
//		 Integer i1=(Integer)ob1;
//		 Integer i2=(Integer)ob2;
//		 if(i1>i2)
//			 return -1;
//		 else if(i1<i2)
//			 return 1;
//		 else
//			 return 0;
		 
//		 //if you want insertion order maintain
//		 return +1;
		 
//		 //if you want reverse order
//		 return -1;
		 
//		 //it means only first element will be inserted
//		 //remaining element will be considered as duplicate
//		 //and duplicate not allow in TreeSet so o/p will be only first element
//		 return 0;
		 
	 }

public static void main(String[] args) {
	// TODO Auto-generated method staus
	
	TreeMapDemo tm=new TreeMapDemo();
	TreeMap t=new TreeMap(tm);
	t.put(11, "salu");
	t.put(23, "priya");
	t.put(22, null);
	t.put(100, null);
	//t.put("a", null);//ClassCastException
   //t.put(null, 78);//NullPointerException
	System.out.println(t);

}

}

