import java.io.*;
import java.util.*;

/**
 * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
 * We define a token to be one or more consecutive English alphabetic letters. 
 * Then, print the number of tokens, followed by each token on a new line.
 * @author Alaa
 *
 */
public class JavaStringTokens {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in a sentence: ");
		String s = scan.nextLine();
		if(!scan.hasNext()){
			System.out.print(0);
			return;
		}
		String[] split = s.trim().split("[\\' '\\!\\,\\?\\.\\_\\'\\@]+");
		System.out.println(split.length);
		for(int i = 0; i < split.length; i++){
			System.out.println(split[i]);
		}
		scan.close();
	}

}
