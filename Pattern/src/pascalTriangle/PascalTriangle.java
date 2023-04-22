package pascalTriangle;
import java.util.*;

//public class PascalTriangle {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		for(int i=1;i<=5;i++) {
//			for(int k=i;k<5;k++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++)
//				System.out.print("*"+" ");
//			System.out.println();
//		}
//
//	}
//
//}


public class PascalTriangle {
    
    private static final int MAX_ROWS = 10;
    private static int[][] triangle = new int[MAX_ROWS][MAX_ROWS];
    private static int[] primes = new int[100]; // Assumes there will be no more than 100 primes in the first 10 rows
    private static int numPrimes;
    
    public static void main(String[] args) {
        // Generate list of prime numbers up to the maximum number in the triangle
        sieveOfEratosthenes(MAX_ROWS*MAX_ROWS);
        
        // Fill in the Pascal Triangle with prime numbers
        for (int i = 0; i < MAX_ROWS; i++) {
            for (int j = 0; j <= i; j++) {
                // Find the kth prime number
                int k = i * (i-1) / 2 + j;
                
                // Check if the kth prime number is within the list of prime numbers
                if (k < numPrimes) {
                    triangle[i][j] = primes[k];
                }
            }
        }
        
        // Print out the Pascal Triangle with the prime numbers
        for (int i = 0; i < MAX_ROWS; i++) {
            // Print out leading spaces
            for (int j = 0; j < MAX_ROWS-i-1; j++) {
                System.out.print("   ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d   ", triangle[i][j]);
            }
            System.out.println();
        }
    }
    
    private static void sieveOfEratosthenes(int maxNumber) {
        boolean[] numbers = new boolean[maxNumber+1];
        // Initialize array to true
        for (int i = 2; i <= maxNumber; i++) {
            numbers[i] = true;
        }
        
        // Mark multiples of prime numbers as not prime
        for (int i = 2; i <= Math.sqrt(maxNumber); i++) {
            if (numbers[i]) {
                for (int j = i*i; j <= maxNumber; j += i) {
                    numbers[j] = false;
                }
            }
        }
        
        // Save prime numbers to array
        numPrimes = 0;
        for (int i = 2; i <= maxNumber; i++) {
            if (numbers[i]) {
                primes[numPrimes++] = i;
            }
        }

		
		
////		printPrimeInRange		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int flag;
//		if(a>b) {
//			for(int i=b;i<=a;i++){
//				if(i==1 || i==0)
//					continue;
//				flag=0;
//				for(int j=2;j<=i/2;j++){
//					if(i%j==0) {
//						flag=1;
//						break;
//					}
//				}
//				if(flag==0)
//					System.out.print(i+" ");
//			}
//		}else {
//			for(int i=a;i<=b;i++) {
//				if(i==1 || i==0)
//					continue;
//				flag=0;
//				for(int j=2;j<=i/2;j++){
//					if(i%j==0) {
//						flag=1;
//						break;
//					}
//				}
//				if(flag==0)
//					System.out.print(i+" ");
//			}	
//		}
		
		
////		printPrimeInRange
//		int flag;
//		for(int i=1;i<20;i++) {
//			flag=0;
//			if(i==1 || i==0)
//				continue;
//			for(int j=2;j<=i/2;j++) {
//				if(i%j==0) {
//					flag=1;
//					break;
//				}
//			}
//			if(flag==0) {
//				System.out.print(i+" ");
//			}
//		}

	}

}

