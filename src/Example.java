/**
 * Given an integer array, The array is [0,1,0,2,0,3]
 * Return an array that is [1,2,3,0,0,0]
 * @author Alaa
 *
 */
public class Example {
	
	public int[] arr (int[] arr){
		
		int [] newarr  = new int[arr.length];
		int counter = 0;
		
		for(int i = 0; i < arr.length; i++){
			
			if(arr[i] != 0){
				newarr[counter] = arr[i];
				counter++;
			}
		}
		int howmanyzeros = arr.length - (counter + 1);
		for(int i = counter + 1; i < howmanyzeros; i++ )
			newarr[i] = 0;
		
		return newarr;
	}
		
}
