package seftel;

import java.util.Scanner;
/**isPrime.java
 * finds if number is prime or not
 * @author Ryan Seftel
 *date 03/04/2017
 */
public class isPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to verify if its a prime number");
		int x = scan.nextInt();
		scan.close();
		System.out.println(primeNum(x));;
	}
	/**
	 * finds if number is prime or not
	 * @param x
	 * @return is true or not
	 */
	public static boolean primeNum ( int x) {
		for (int i = x/2; i > 1; i--) {
			if (isDivisible(x, i) ) {
				
				return false;
			}
			
		}
		return true;
	}
	/**
	 * checks if number is divisible
	 * @param a
	 * @param b
	 * @return if is divisible
	 */
	public static boolean isDivisible ( int a, int b){
		if (a%b == 0){
			return true;
			
			
		}
		return false;
	}

}
