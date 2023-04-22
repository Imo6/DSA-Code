import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class streamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stream stream=Stream.of("naveen","raj","sonu","peels","peter");
//		long t1=System.currentTimeMillis();
//		//stream.forEach(System.out::println);
//		Stream.of("naveen","raj","sonu","peels","peter","abc","hdsd","kdhdh").forEach(System.out::println);
//		long t2=System.currentTimeMillis();
//		System.out.println(t2-t1);
//		System.out.println("..................");
//		long t3=System.currentTimeMillis();
//		Stream.of("naveen","raj","sonu","peels","peter","abc","hdsd","kdhdh").parallel().forEach(System.out::println);
//		long t4=System.currentTimeMillis();
//		System.out.println(t4-t3);
		
//		List<Integer> list=new ArrayList<>();
//		for(int i=0;i<5000;i++) {
//			list.add(i);
//		}
//		
//		//sequential stream
//		long t1=System.currentTimeMillis();
//		List<Integer> list1=list.stream().collect(Collectors.toList());
//		System.out.println(list1+" ");
//		long t2=System.currentTimeMillis();
//		System.out.println(t2-t1);
//		
//		//list.clear();
//		
//		//parallel stream
//		long t3=System.currentTimeMillis();
//		List<Integer> list2=list.stream().parallel().collect(Collectors.toList());
//		System.out.println(list2+" ");
//		long t4=System.currentTimeMillis();
//		System.out.println(t4-t3);
		
		
		List<Integer> list=Arrays.asList(3,7,90,20,10,50,40);
		List<Integer> list1=list.stream().collect(Collectors.toList());
		System.out.println(list1);
		
//		//sorted
//		List<Integer> list2=list.stream().sorted().collect(Collectors.toList());
//		System.out.println(list2);
		
//		//even number
//		List<Integer> list3=list.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(list3);
		
//		//add 100 to each element
//		List<Integer> list4=list.stream().map(i->i+100).collect(Collectors.toList());
//		System.out.println(list4);
		
//		//count less than a specific number
//		long list5=list.stream().filter(i->i<12).count();
//		System.out.println(list5);
		
//		//print number less than 10
//		List<Integer> list6=list.stream().filter(i->i<10).collect(Collectors.toList());
//		System.out.println(list6);
		
//		//print number less than 10 odd number
//		List<Integer> list7=list.stream().filter(i->i<10).filter(i->i%2==1).collect(Collectors.toList());
//		System.out.println(list7);
		
//		//print prime number        
//        List<Integer> list8=list.stream()
//        .filter(n -> IntStream.range(2, (int) Math.sqrt(n) + 1).allMatch(i -> n % i != 0)).collect(Collectors.toList());
//        System.out.println(list8);
        
        
//      //print prime number        
//       list.stream()
//       .filter(n -> IntStream.range(2, (int) Math.sqrt(n) + 1).allMatch(i -> n % i != 0)).forEach(System.out::println);
      

       
//list.stream()
//    .flatMap(j->list.stream().map(i->new int [] {i,j}))
//    .filter(pair -> pair[0] + pair[1] == 10)
//    .forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));


list.stream()
    .flatMap(i -> list.stream().flatMap(j -> list.stream().map(k -> new int[] {i, j, k})))
    .forEach(triple -> System.out.println("(" + triple[0] + ", " + triple[1] + ", " + triple[2] + ")"));

//long count=list.stream()
//               .flatMap(i->list.stream().flatMap(j->list.stream().map(k->new int[] {i,j,k})))
//               .filter(triple -> triple[0] + triple[1] + triple[2] == 5)
//               .count();
//System.out.println("All the 3 pairs having sum 10= "+count);

//list.stream()
//    .flatMap(i->list.stream().flatMap(j->list.stream().flatMap(k->list.stream().map(m->new int[]{i,j,k,m}))))
//    .filter(pair->pair[0] + pair[1]+pair[2] + pair[3] == 30)
//    .forEach(pair->System.out.println("("+pair[0]+","+pair[1]+","+pair[2]+","+pair[3]+")"));
	
	}

}
