package patikadev;

import java.util.Scanner;

public class RecursivePower {
	   static int power (int a, int b){
	        int result = 1;
	        for (int i = 1; i <= b; i++){
	            result *= a;
	        }
	        return result;
	    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int a = input.nextInt();
        System.out.print("Please enter the power: ");
        int b = input.nextInt();
        System.out.print("Result: "+power(a,b));
        input.close();

	}

}
