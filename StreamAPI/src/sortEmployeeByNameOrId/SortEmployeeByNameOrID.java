package sortEmployeeByNameOrId;
import java.util.*;
import java.util.stream.Collectors;

public class SortEmployeeByNameOrID {
	int Id;
	String name;
	int salary;
	
	public SortEmployeeByNameOrID() {
		
	}

	public SortEmployeeByNameOrID(int id, String name, int salary) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		SortEmployeeByNameOrID obj=obj=new SortEmployeeByNameOrID(1,"Priya",1000);
		SortEmployeeByNameOrID obj1=new SortEmployeeByNameOrID(2,"Aparna",2200);
		SortEmployeeByNameOrID obj2=new SortEmployeeByNameOrID(3,"Sweety",6500);
		SortEmployeeByNameOrID obj3=new SortEmployeeByNameOrID(5,"zuhi",14000);
		SortEmployeeByNameOrID obj4=new SortEmployeeByNameOrID(4,"Salu",40000);
		SortEmployeeByNameOrID obj5=new SortEmployeeByNameOrID(5,"Kajal",5000);
		
		//System.out.println(obj+"\n"+obj1+"\n"+obj2+"\n"+obj3+"\n"+obj4);
		
		
		List<SortEmployeeByNameOrID> list=new ArrayList<>();
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		
		System.out.println(list);
		
		//sorted by employee name
		List<SortEmployeeByNameOrID> sortedtlist= list.stream()
				.sorted(Comparator.comparing(SortEmployeeByNameOrID::getName))
				.collect(Collectors.toList());
		
		System.out.println(sortedtlist);
		
		//sorted by employee by id
				List<SortEmployeeByNameOrID> sortedtlist1= list.stream()
						.sorted(Comparator.comparing(SortEmployeeByNameOrID::getId))
						.collect(Collectors.toList());
				
				System.out.println(sortedtlist1);
				
				//sorted by employee by salary
				List<SortEmployeeByNameOrID> sortedtlist2= list.stream()
						.sorted(Comparator.comparing(SortEmployeeByNameOrID::getSalary))
						.collect(Collectors.toList());
				
	}

}
