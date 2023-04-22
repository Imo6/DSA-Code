package swapping_withoutUsing3rdVariable;
import java.util.Scanner;
public class swapping_withoutUsing3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter two numbers");
	  int num1=sc.nextInt();
	  int num2=sc.nextInt();
	  System.out.println("number before swapping "+num1+" "+num2);
	  //swapping
	  num1=num1+num2;
	  num2=num1-num2;
	  num1=num1-num2;
	  System.out.println("number after swapping "+num1+" "+num2);

	}

}
