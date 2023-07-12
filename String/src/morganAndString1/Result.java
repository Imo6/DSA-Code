package morganAndString1;
import java.util.*;
public class Result {
	public static String morganAndString(String a, String b) {
	    List<String> s1 = new ArrayList<>();
	    List<String> s2 = new ArrayList<>();
	    List<String> s3 = new ArrayList<>();

	    for (int i = 0; i < a.length(); i++) {
	        s1.add(String.valueOf(a.charAt(i)));
	    }

	    for (int i = 0; i < b.length(); i++) {
	        s2.add(String.valueOf(b.charAt(i)));
	    }

	    int res = Math.min(s1.size(), s2.size());
	    int i=0;
	    int j=0;
	   while (i < a.length() && j < b.length()) {
	        int cmp = s1.get(i).compareTo(s2.get(j));
	        if (cmp < 0) {
	            s3.add(s1.get(i));
	            i++;
	        } else if (cmp > 0) {
	            s3.add(s2.get(j));
	            j++;
	        } else {
	            s3.add(s1.get(i));
	            i++;
	        }
	    }

	    while (i < a.length()){
	        s3.add(s1.get(i));
	        i++;
	    }

	    while (j < b.length()){
	        s3.add(s2.get(j));
	        j++;
	    }

	    return String.join("", s3);
	}
	       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="JACK";
		String b="DANIEL";
		String res=Result.morganAndString(a, b);
		System.out.println(res);

	}

}

//public class Result extends Thread {
//        public void run() {
//        		String s=Thread.currentThread().getName();
//        		if(s.equals("first")){
//        			for(int i=0;i<=20;i++) {
//        				 if(i%2==0)
//        	                System.out.print(i+" ");
//        			}
//                }else {
//                	for(int i=0;i<=20;i++) {
//       				 if(i%2!=0)
//       	                System.out.print(i+" ");
//       			}
//               }
//                }
//        }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Result r=new Result();
//		Thread t1=new Thread(r);
//        Thread t2=new Thread(r);
//        t1.setName("first");
//        t2.setName("second");
//        t1.start();
//        t2.start();
//	}
//
//}
//
