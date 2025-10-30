// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Scanner;

public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		// Scanner input = new Scanner(System.in);
		// System.out.println("enter lim > 0 ");
        // int lim = input.nextInt();
		int lim = Integer.parseInt(args[0]);
		int a = (int)(lim*Math.random());
		int b = (int)(lim*Math.random());
		int c = (int)(lim*Math.random());
		System.out.println(a+" "+b+" "+c);
		int min = Math.min(a,Math.min(b,c));
		int max = Math.max(a,Math.max(b,c));
		System.out.println(min+" "+(a+b+c-max-min)+" "+max);
	}
}
