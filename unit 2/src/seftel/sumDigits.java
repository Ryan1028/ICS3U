package seftel;

import java.util.Scanner;
/** SumOfDigits.java program
 * finds the sum of four given numbers
 * @author Ryan Seftel
 *date 05/04/2017
 */
public class sumDigits {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number with two or more digits");
		int x = scan.nextInt();
		System.out.println(SumDigits(x));
		scan.close();
		
		/**
		 * find the sum of four digits, then returns
		 * @param x
		 * @return the sum of numbers
		 */
	}
		public static int SumDigits(int x)
		{
			int sum = 0;
					while (x>0){
						sum=sum+ x%10;
						x =x/10;
						
					}
				return sum;
			}
					
		
		
	

	
	}

