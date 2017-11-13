import java.util.Scanner;


public class Palindrome {

	
	public static void checkPalind(String p){
		for(int i = 0; i < p.length(); i++){
			String a = p.substring(i, i + 1);
			String b = p.substring(p.length()- i -1, p.length() - i);
			if(!b.equals(a)){
				System.out.println("This is not a palindrome");
				return;
			}
		}
		System.out.println("This is a palindrome");	
	}
	
	public static void main(String[] args){
		
		System.out.println("Please type in a Palindrome: ");
		Scanner in = new Scanner(System.in);
		String p = in.nextLine();
		checkPalind(p);
		in.close();
	}
}
	
