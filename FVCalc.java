// Computes the future value of a saving investment.

import java.util.Scanner;

public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		//Scanner input = new Scanner(System.in);
		//System.out.println("enter invested sum , rate , num of years :");
        //int currentValue = input.nextInt();
		//double rate = (input.nextInt())/100.0;
        //int n = input.nextInt();
		int currentValue = Integer.parseInt(args[0]);
            
        double rate = Double.parseDouble(args[1]) / 100.0;
        int n = Integer.parseInt(args[2]);
		double futureValue = currentValue*(Math.pow((1+rate),n));
		System.out.println("After "+n+" years, $"+currentValue+" saved at "+rate*100+"% will yield $"+(int)futureValue);
	}
}

// Good job, same comment as in NumWords.java :)
