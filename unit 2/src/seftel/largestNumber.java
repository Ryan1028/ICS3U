package seftel;
import java.util.Scanner;
/** largestNumber.java program
 * finds the largest of four given numbers
 * @author Ryan Seftel
 *date 05/04/2017
 */
public class largestNumber {

	public static void main(String[] args) {
		System.out.println(" enter how many numbers you want");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("enter your numbers with a space in between them");
		//System.out.println(largest(x));
		int [] numbers = new int [num];
		for (int i = 0; i < num ; i ++)
		{
			numbers[i] = scan.nextInt();
			
		}
		System.out.println(greatestNum(numbers));
		
		scan.close();
		}
	
		/**
		 * finds and returns the largest number of a series
		 * @param num
		 * @return the largest number
		 */
		public static int  greatestNum(int[]num){
			int max = num[0];
			for (int x = 0;x<num.length; x++ ){
				max = Math.max(max, num[x]);
			}
			return max;
		}
		
		

	}


