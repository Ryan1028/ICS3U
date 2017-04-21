package seftel;
/**PerfectIntegers
 * displays all perfect integers up to 100
 * @author Ryan Seftel
 * date 20/04/2017
 */

public class PerfectIntegers {

	public static void main(String[] args) {
		for (int a = 1; a<1000; a++){
			int Factor = 0;
			for (int b = 1; b<a ; b++){
				if ( a % b == 0){
					Factor = Factor + b;
					
				}
				
			}
			if ( Factor == a){
		System.out.println(Factor);
			}
	}
	
		
				
	
		
	
		
		
	}

}
