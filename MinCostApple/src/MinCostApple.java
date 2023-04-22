import java.util.*;
public class MinCostApple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l1=sc.nextInt();
		int c1=sc.nextInt();
		int l2=sc.nextInt();
		int c2=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		
		int m1=1;
		int m2=1;
		
		for(int i=1;i<n/2;i++) {
			for(int j=1;j<n/2;j++) {
				if(l1*i+l2*j==19) {
					list.add(c1*i+c2*j);
				}
			}
		}
		if(list.isEmpty())
			System.out.println("No any pair possible");
		else
		System.out.println(Collections.min(list));

	}

}
