import java.util.HashMap;
import java.util.Scanner;

/**
 * You are given a phone book that consists of people's names and their phone number. 
 * After that you will be given some person's name as query. 
 * For each query, print the phone number of that person.
 * @author Alaa
 *
 */
public class Phonebook {
	
	public static void main(String[] args){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n; i++){
			String name = in.nextLine().toLowerCase();
			int phone = in.nextInt();
			map.put(name, phone);
			in.nextLine();	
		}
		
		while(in.hasNext()){
			String s = in.nextLine();
			if(map.get(s) != null)
			{
				System.out.println(s + "=" + map.get(s));
			}
			else{
				System.out.println("Not found");
			}
			
		}
		in.close();
	}

}
