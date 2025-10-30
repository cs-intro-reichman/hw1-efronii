// Splits a restaurant bill evenly among three diners.

import java.util.Scanner;

public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		//Scanner input = new Scanner(System.in);
        //System.out.println("insert three names and after each name press enter");
        //String name1 = input.nextLine();
        //String name2 = input.nextLine();
        //String name3 = input.nextLine();
		//System.out.println("enter the total amount ");
        //double total = input.nextDouble();


		String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
		double total = Double.parseDouble(args[3]);
		System.out.println("Dear "+name3+", "+name2+", and "+name1+": pay "+Math.ceil((total/3))+" Shekels each.");
	    // Replace this comment with the rest of your code   
	}
}
