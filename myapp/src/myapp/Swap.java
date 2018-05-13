//WAP to swap two numbers

package myapp;

public class Swap {
	
	
	
	
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		System.out.println("Before swapping num1=" +num1);
		System.out.println("Before swapping num2=" +num2);
		
		swapNumbers(num1, num2);
		
	}
	public static void swapNumbers(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping the num1=" +num1);
		System.out.println("After swapping the num1=" +num2);
	}

}
