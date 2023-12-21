/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        if (num1 >= num2) {
            System.out.println("Invalid range. Number 2 must be greater than number 1.");
            return;
        }

        Random random = new Random();
        int random1 = random.nextInt(num2 - num1) + num1;
        int random2 = random.nextInt(num2 - num1) + num1;
        int random3 = random.nextInt(num2 - num1) + num1;

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        int minNum = Math.min(Math.min(random1, random2), random3);
        System.out.println("The minimal generated number was " + minNum);
	}
}
