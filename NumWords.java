// Prints a given number using a hundreds, tens, and units notation.

import java.util.Scanner;

public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		//Scanner input = new Scanner(System.in);
		//System.out.println("enter a num plzz");
        //int num = input.nextInt();
		int num = Integer.parseInt(args[0]);
		System.out.println(num/100 +" hundreds, "+(num%100)/10+" tens, and "+num%10+" ones.");
	}
}

// I would seperate the logic from the printing. 
// What i mean is having variables for:
// 'int hundreds' 'int tens' and 'int units'
// It doesnt cost you much and is a lot more readable than trying to figure out what you were trying to do.. 

