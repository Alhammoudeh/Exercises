import java.util.Scanner;

/**
 * Return the nth Fibonacci number
 * Example: If I give you an input of 3
 * Result: You'll return the third fibonacci number
 * @author Al
 *
 */
public class Fibonacci {
	
	//Solution
	public static int fibonacci(int n){
		if(n == 0){
			return 0;
		}
		else if(n == 1 || n ==2 ){
			return 1;
		}
		else{
			return fibonacci(n - 1) + fibonacci(n -2);
		}
	}

	//Interesting Solution....
	public static int getFib(int n){
		if(n <= 1){
			return n;
		}
		
		int result = 0;
		int[] arr = new int[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <= n;i++){
			 arr[i] = arr[i-1] + arr[i-2];
			 result = arr[i];
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please Choose a number: ");
		int n = input.nextInt();
		input.close();
		int result = fibonacci(n);
		System.out.println(n +" is " + result + " in the Fibonacci sequence");
	}
}
