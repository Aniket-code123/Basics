package cnow;

import java.util.Scanner;

//public class Febonacci_series {

//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number of terms");
//		
//		int number = 6;
//		int first = 0, second = 1, next;
//		System.out.println("Fibonacci series is ");
//		for ( int i = 0; i<=number; i++)
//		{
//		System.out.print(first + " ");
//		next = second+first;
//		first = second;
//		second = next;
//
//	}
//
//  }
	
	import java.util.Scanner;
	public class Febonacci_series {
		
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	 // Ask user for input
    System.out.println("Enter a string to reverse:");
    String originalString = scanner.nextLine();

    // Reverse the string using a StringBuilder
    //String reversedString = new StringBuilder(originalString).reverse().toString();
    
    String reversedString = new StringBuilder(originalString).reverse().toString();
    
    System.out.println("Reversed string: " + reversedString);

    // Output the reversed string
    //System.out.println("Reversed string: " + reversedString);
}
}
	
	
	
	
	
	
