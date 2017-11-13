import java.util.Scanner;

/**
 * Returns a string given an int
 Print out buzz if divisible by 3
 Print out fizz if divisible by 5
 Print out fizz-buzz if divisible by both 3 and 5
 * @author Al
 *
 */
public class Significants {
	
	public static void Divisibility(int x){
		
		if(x % 3 == 0 && x % 5 == 0){
			System.out.println("fizz-buzz");
		}
		else if(x % 3 == 0){
			System.out.println("buzz");
		}
		else if(x % 5 == 0 ){
			System.out.println("fizz");
		}
		else{
			System.out.println("This value isn't divisble by 3 or 5.");
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input value: ");
		int x = sc.nextInt(); 
		Divisibility(x);	
	}

}
