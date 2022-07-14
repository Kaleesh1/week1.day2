package week1.day2;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code

		 * a) Declare A String value as"madam"

		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		String pal = "madam";
		String rev="";
		for (int i = pal.length()-1; i > -1; i--) {
			char t = pal.charAt(i);
			rev += t;	
		}
		
if (pal.equals(rev))
	System.out.println(pal + "   " + rev + "    " + "This is A Plaindrome!!!");
else
	System.out.println(pal + "   " + rev + "    "  + "This is not A Plaindrome!!!");

	}
}