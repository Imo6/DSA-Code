package sortEmployeeByNameOrId;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

final class SortEmployeeByFirstNameAndLastName {
	private final String FitsrName,LastName;
	public SortEmployeeByFirstNameAndLastName(String fitsrName, String lastName) {
		super();
		FitsrName = fitsrName;
		LastName = lastName;
	}
	public String getFitsrName() {
		return FitsrName;
	}
	public String getLastName() {
		return LastName;
	}
	
	@Override
	public String toString() {
		return "SortEmployeeByFirstNameAndLastName [FitsrName=" + FitsrName + ", LastName=" + LastName + "]";
	}


	public static void main(String[] args) {
		SortEmployeeByFirstNameAndLastName obj=new SortEmployeeByFirstNameAndLastName("Priya","Singh");
		SortEmployeeByFirstNameAndLastName obj6=new SortEmployeeByFirstNameAndLastName("Aparna","Thakur");
		SortEmployeeByFirstNameAndLastName obj2=new SortEmployeeByFirstNameAndLastName("Sweety","Jain");
		SortEmployeeByFirstNameAndLastName obj3=new SortEmployeeByFirstNameAndLastName("zuhi","Khanam");
		SortEmployeeByFirstNameAndLastName obj4=new SortEmployeeByFirstNameAndLastName("Salu","Kumari");
		SortEmployeeByFirstNameAndLastName obj5=new SortEmployeeByFirstNameAndLastName("Kajal","Raghav");
		
		List<SortEmployeeByFirstNameAndLastName> list=new ArrayList<>();
		list.add(obj);
		list.add(obj6);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		
		List<SortEmployeeByFirstNameAndLastName> sortedList=list.stream().sorted(Comparator.comparing(SortEmployeeByFirstNameAndLastName::getFitsrName)
				             .thenComparing(SortEmployeeByFirstNameAndLastName::getLastName))
				                    .collect(Collectors.toList());
		
		System.out.println(sortedList);
				             

	}

}
