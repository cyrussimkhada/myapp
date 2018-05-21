//WAP to swap two numbers

package myapp;

public class Swap {
	
	public static void main(String[] args) {
		int num1;
		int num2;
		
		
		swapNumbers(5, 10);
		
	}
	public static void swapNumbers(int num1, int num2) {
		System.out.println("Before swapping num1=" +num1);
		System.out.println("Before swapping num2=" +num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping the num1=" +num1);
		System.out.println("After swapping the num1=" +num2);
	}

}
