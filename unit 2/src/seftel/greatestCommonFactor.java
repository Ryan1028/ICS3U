package seftel;

import java.util.Scanner;

/**GreatestCommonFactor.java
 * finds the greatest common factor of 2 given numbers
 * @author Ryan Seftel
 *date 05/04/2017
 */
public class greatestCommonFactor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 numbers to find the greatest common factor ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(GreatestFactor(a,b));
		scan.close();
	}
		 /**
		  * finds and return gcf
		  * @param c
		  * @param d
		  * @return greatest common factor
		  */
		public static int GreatestFactor(int c,int d){
			 if (c>d){
				 for (int x = c; x > 0; x-- ){
					 if (isDivisible(c,x) && isDivisible(d,x)){
						 return x;
					 }
				 }
			 }
			 
			 if (d>c){
				 for (int x = d; x > 0; x--){
					 if (isDivisible(d,x)  && isDivisible(c,x) ){
						 return x;
					 }
				 }
				 
			 }
			 return c;
		}
	/**
	 * checks if number is divisible
	 * @param a
	 * @param b
	 * @return of is divisible
	 */
		public static boolean isDivisible ( int a, int b){
			if (a%b == 0){
				return true;
				
				
			}
			return false;
		}

	

}
