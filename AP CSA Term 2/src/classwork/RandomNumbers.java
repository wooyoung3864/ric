package classwork;

public class RandomNumbers {
	public static void main(String[] args)
	{
		
		int num1;
		double num2;
		num1 = (int) (Math.random() * 10);
		System.out.println("From 0 to 9: " + num1);
		num1 = (int) (Math.random() * 10 + 1);
		System.out.println("From 1 to 10: " + num1);
		num1 = (int) (Math.random() * 15 + 20);
		System.out.println("From 20 to 34: " + num1);
		num1 = (int) (Math.random() * 20 - 10);
		System.out.println("From -10 to 9: " + num1);
		num2 = Math.random();
		System.out.println("A random double [between 0-1]: " + num2);
		num2 = Math.random() * 6;
		num1 = (int) num2 + 1;
		System.out.println("From 1 to 6: " + num1);
		
		int num3;
		double num4;
		num4 = Math.random(); //Returns a random number between 0 and 0.99999999999999
		System.out.println(num4);
		num4 = (Math.random() * 8); //0 to 7.99999999999
		System.out.println(num4);
		num3 = (int) (Math.random() * 20); //0 to 19
		System.out.println(num3);
		num3 = (int) (Math.random() * 20) +1; //1 to 19
		System.out.println(num3);
		num3 = (int) Math.random() * 20 + 5;
		System.out.println(num3);
		
	}
}
