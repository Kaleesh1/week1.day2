package week1.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Pseudo Code:
			 
			 * Declare the input as Follow
		      		String test = "I am a software tester"; 
			a) split the words and have it in an array
			b) Traverse through each word (using loop)
			c) find the odd index within the loop (use mod operator)
			
			d)split the words and have it in an array
			
			e)print the even position words in reverse order using another loop (nested loop)
			f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
			*/
		String test = "I am a software tester"; 
		System.out.println("original String: " + test);
		String[] split = test.split(" ");
		String sp2 = "";
		for (int i = 0; i < split.length; i++) {
			if (i%2!=0) {
				String sp1 = split[i];
				char[] charArray = sp1.toCharArray();
				//System.out.println(charArray);
				for (int j = charArray.length-1; j >= 0; j--) {
					//System.out.println(charArray[j]);
					sp2 += charArray[j];
				}
				//System.out.println(sp2);
				//sp2 += sp1;
				
			} else {
				sp2 += " " + split[i] + " ";
			}	
		}
		System.out.print("After Even Word rev:" + sp2 + " ");
			 

	}

}
