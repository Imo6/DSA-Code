package buildBinaryTree;
import java.util.Scanner;
public class MyClass {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the input
	        int n = scanner.nextInt();

	        // Find the display size
	        int[] displaySize = findDisplaySize(n);

	        // Print the result
	        System.out.println(displaySize[0] + " " + displaySize[1]);
	    }

	    public static int[] findDisplaySize(int n) {
	        int a = (int) Math.sqrt(n);  // Start with the square root of n as the number of rows
	        while (n % a != 0) {
	            a--;
	        }
	        int b = n / a;
	        return new int[]{a,b};
	    }
	}
