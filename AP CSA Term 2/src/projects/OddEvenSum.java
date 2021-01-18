package projects;
import java.util.Arrays;
import java.util.Scanner;

public class OddEvenSum {
	
	public static int[] numbers;
	
	public static void createArray() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		numbers = new int[num];
		int i = 1; 
		while(i <= num)
		{
			i = numbers[i];
		}
		in.close();
	}
	
	public static void arraySum() {
		int even = 0, odd = 0;
		for(int i = 0; i < numbers.length; ++i) {
			if(i % 2 == 0) {
				even += numbers[i];
			} else if(i % 2 == 1) {
				odd += numbers[i];
			}
		}
		System.out.println("Sum of even numbers is " + even);
		System.out.println("Sum of odd numbers is " + odd);
	}
	
	public static void main(String[] args)
	{
		createArray();
		arraySum();
	}
}
