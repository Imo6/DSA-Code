package treeSet;
import java.util.*;

////Sorting based on employee id
//public class Employee implements Comparable {
//	int eid;
//	String name;
//	
//	public Employee(String name,int eid) {
//		this.eid=eid;
//		this.name=name;
//	}
//	@Override
//	public String toString() {
//		return "[eid=" + eid + ", name=" + name + "]";
//	}
//	
//	public int compareTo(Object obj) {
//		int eid1=this.eid;
//		Employee e=(Employee)obj;
//		int eid2=e.eid;
//		if(eid1<eid2)
//			return -1;
//		else if(eid1>eid2)
//			return +1;
//		else
//			return 0;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Employee e1=new Employee("nag",100);
//		Employee e2=new Employee("balaih",200);
//		Employee e3=new Employee("chiru",50);
//		Employee e4=new Employee("venki",140);
//		Employee e5=new Employee("nag",900);
//		
//		TreeSet t=new TreeSet();
//		t.add(e1);
//		t.add(e2);
//		t.add(e3);
//		t.add(e4);
//		t.add(e5);
//		System.out.println(t);	
//	}
//}



//Sorting based on employee name
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		SortEmployeeByFirstNameAndLastName e1=(SortEmployeeByFirstNameAndLastName)obj1;
		SortEmployeeByFirstNameAndLastName e2=(SortEmployeeByFirstNameAndLastName)obj2;
		
		String s1=e1.name;
		String s2=e2.name;
		
		return s1.compareTo(s2);
	}
}

public class SortEmployeeByFirstNameAndLastName{
	int eid;
	String name;
	
	public SortEmployeeByFirstNameAndLastName(String name,int eid) {
		this.eid=eid;
		this.name=name;
	}
	@Override
	public String toString() {
		return "[eid=" + eid + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortEmployeeByFirstNameAndLastName e1=new SortEmployeeByFirstNameAndLastName("nag",100);
		SortEmployeeByFirstNameAndLastName e2=new SortEmployeeByFirstNameAndLastName("balaih",200);
		SortEmployeeByFirstNameAndLastName e3=new SortEmployeeByFirstNameAndLastName("chiru",50);
		SortEmployeeByFirstNameAndLastName e4=new SortEmployeeByFirstNameAndLastName("venki",140);
		SortEmployeeByFirstNameAndLastName e5=new SortEmployeeByFirstNameAndLastName("arti",900);
		
		TreeSet t=new TreeSet(new MyComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);	
	}
}

