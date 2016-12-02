import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.pruden
 *
 */
public class ArrayCountCoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Values = new int[10];
		int Count = 0;
		int Search;
		Scanner userInput = new Scanner(System.in);
		
		for(int i = 0; i < Values.length; i++){
			System.out.print("Please enter a number: ");
			Values [i] = userInput.nextInt();
		}
		
		System.out.print("What value do you want to search for? ");
		Search = userInput.nextInt();
		
		for(int i = 0; i < Values.length; i++){
			if(Search == Values[i]){
				Count ++;
			}
		}
		
		System.out.println("This was  found " + Count + " times.");
		
		userInput.close();
	}

}
