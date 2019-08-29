package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("the first person's name?");
		String s1 = ap.nextString("the second person's name?");
		String s2 = ap.nextString("the third person's name?");
		String s3 = ap.nextString("the fourth person's name");
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println("Greetings, "+s0+", "+s1+", "+s2+", "+s3+".");
	}
}
