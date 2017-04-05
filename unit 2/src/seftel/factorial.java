package seftel;

import java.util.Scanner;
/**factorial.java
 * find the factorial of a number
 * @author Ryan Seftel
 *date 03/04/2017
 */
 
 
public class factorial {

	public static void main(String[] args) {
	
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the number you wish to factorialize");
			int x = scan.nextInt();
			scan.close();
			System.out.println(Factorial(x));;
			

	}
	/**
	 * finds the factorial and returns
	 * @param x
	 * @return factorial
	 */
	public static int Factorial(int x)
	{
		if (x < 0)
		{
			return -1;
		}
		else if(x==0){
			return 1;
		}
		else {
			int product = x;
			while (x >1){
				product = product * (x-1);
				x--;
			}
			return product;
			
		}
		
	
		
	
		
	}

}
