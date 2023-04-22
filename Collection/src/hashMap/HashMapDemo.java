package hashMap;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m=new HashMap();
		m.put("neha",700);
		m.put("salu",800);
		m.put("priya",200);
		System.out.println(m);
		
		System.out.println(m.put("neha", 1000));
		
		System.out.println("\n.....collections view of map......");
		Set s=m.keySet();
		System.out.println(s);
		
		Collection c=m.values();
		System.out.println(c);
		
		Set s1=m.entrySet();
		System.out.println(s1);
		
		System.out.println("\n.....Entry specific methods......");
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			
			System.out.println(m1.getKey()+"...."+m1.getValue());
			if(m1.getKey().equals("neha")) {
				m1.setValue(2000);
			}
		}
		System.out.println(m);
		
		System.out.println("size of map= "+m.size());
		System.out.println("containsKey? = "+m.containsKey("priya"));
		System.out.println("containsValue? ="+m.containsValue(600));
		m.clear();
		System.out.println(m);
		System.out.println("map is empty? = "+m.isEmpty());
		

	}

}
