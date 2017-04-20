package seftel;
/**Pythagoreantriple
 * finds perfect triangles
 * @author Ryan Seftel
 * date 19/04/2017
 */
public class PythagoreanTriple {

	public static void main(String[] args) {
		
		for(int a = 1; a<100; a++){
			for (int b = 1; b<100; b++){
				int c =  (int) (Math.pow(a, 2) + Math.pow(b, 2));
				if (perfectsquare(c) == true){
					System.out.println( a + " " + b + " " + (int) Math.sqrt(c) + " ");
				}
			}
		}
		
	}
	/**
	 * determines if a number is a perfect square
	 * @param x
	 * @return true or false
	 */
	public static boolean perfectsquare(int x){
		
		int n = (int)Math.sqrt(x);
		double check = Math.pow(n, 2);
		if (check == x){
			return true;
		}
		return false;
	}

}
