package longestAscendingOrderNumber;
import java.util.*;
public class LongestAscendingNumber {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a 10-digit number: ");
	        long num = sc.nextLong();
	        String numStr = Long.toString(num);

	        List<Character> sequence = new ArrayList<>();
	        List<Character> longestSequence = new ArrayList<>();

	        for (int i = 0; i < numStr.length(); i++) 
	        {
	            char currentChar = numStr.charAt(i);

	            if (sequence.isEmpty() || currentChar >= sequence.get(sequence.size() - 1)) {////nice line
	                sequence.add(currentChar);
	            } else {
	                if (sequence.size() > longestSequence.size()) {
	                    longestSequence = new ArrayList<>(sequence);//nice line
	                }
	                sequence.clear();
	                sequence.add(currentChar);
	            }
	        }

	        if (sequence.size() > longestSequence.size()) {
	            longestSequence = new ArrayList<>(sequence);
	        }

	        StringBuilder result = new StringBuilder();
	        for (Character ch : longestSequence) {
	            result.append(ch);
	        }

	        System.out.println("Longest ascending number: " + result.toString());

	}

}
