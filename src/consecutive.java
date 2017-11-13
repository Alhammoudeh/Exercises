/**
 * Return True if array contains three digits that add to 7 consecutively.
 * @author Al
 *
 */
public class consecutive {

	public static boolean consec(int[] arr){
		
		if(arr.length < 3){
			return false;
		}
		int counter = 0;
		while(counter < arr.length - 2){
			if(arr[counter] + arr[counter + 1] + arr[counter + 2] == 7){
				return true;
				
			}
			else{
				counter++;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,2,3,3};
		boolean a = consec(arr);
		System.out.println(a);
	}
}
