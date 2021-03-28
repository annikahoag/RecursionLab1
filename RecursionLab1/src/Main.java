import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Recursion recurse = new Recursion();
		Scanner scn = new Scanner(System.in);
		
		//enter number "n"
		System.out.println("Please enter a number: ");
		 int n = scn.nextInt();
		 int count=0;
		 int end=1;
		
		//call print symbols method 
		System.out.println("Hashtags in ascending order:"); 
		recurse.printSymbols(n, count, end);
		
		//print spaces
		System.out.println();
		System.out.println();
		System.out.println("Factorial of " + n + ": ");

		//create new variables and call factorials 
		int count2=n;
		int product=n;
		int oneLess=n-1;
		recurse.findFactorial(n, count2, product, oneLess);

		
		scn.close();
	}

}


