package seftel;
import java.util.Scanner;
public class IsPalindrome {

	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.print("please enter your word to find out if its a palindrome");
	String palindrome = sc.nextLine();
	System.out.print(Ispalindrome(palindrome));
	}
	
	public static boolean Ispalindrome(String palindrome ){
		String word = "";
		for (int x = palindrome.length()-1;x>=0;x--){
			word = word + palindrome.charAt(x);
			
		}
		if(palindrome.equals(word)){
			return true;
		}
		return false;
	}
	

	}


