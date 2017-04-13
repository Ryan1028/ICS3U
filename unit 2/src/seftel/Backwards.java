package seftel;

import java.util.Scanner;

public class Backwards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] backwards = sc.nextLine().split(" ");
		for (int x = 0; x < backwards.length; x++){
			for (int z = backwards[x].length() - 1; z>=0; z--){
				System.out.print(backwards[x].charAt(z));
			}
			System.out.print(" ");
		}
		sc.close();
	}

}
