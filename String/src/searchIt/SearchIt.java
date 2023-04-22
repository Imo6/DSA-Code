package searchIt;

import java.util.Scanner;

public class SearchIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch == '\\') { // escape sequence found
                    i++; // skip the backslash
                    char nextChar = line.charAt(i);
                    switch (nextChar) {
                        case 'b': // backspace
                            if (output.length() > 0) {
                                output.deleteCharAt(output.length() - 1); // delete the last character
                            }
                            break;
                        case 'n': // newline
                            output.append('\n'); // append a newline character
                            break;
                        default:
                            output.append('\\'); // append the backslash character
                            output.append(nextChar); // append the next character
                            break;
                    }
                } else { // normal character
                    output.append(ch); // append the character to the output
                }
            }

            System.out.println(output.toString());
        }
    }
}
