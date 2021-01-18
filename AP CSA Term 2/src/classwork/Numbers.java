package classwork;

public class Numbers {
		private static int firstNum;
		private static int secondNum;
		
		public Numbers(int numOne, int numTwo)
		{
			firstNum = numOne;
			secondNum = numTwo;
		}
		
		public void plusFive()
		{
			firstNum = firstNum + 5;
			secondNum = secondNum + 5;
			System.out.println(firstNum);
			System.out.println(secondNum);
		}
		
		public void timesTwo()
		{
			firstNum = firstNum * 2;
			secondNum = secondNum * 2;
			System.out.println(firstNum);
			System.out.println(secondNum);
		}
		
		public void square()
		{
			firstNum = (int) Math.pow(firstNum, 2);
			secondNum = (int) Math.pow(secondNum, 2);
			System.out.println(firstNum);
			System.out.println(secondNum);
		}
		
		public static void main(String[] args)
		{
			final int x = 6;
			final int y = 9;
			
			Numbers num = new Numbers(x, y);
			num.plusFive();
			num.timesTwo();
			num.square();
		}
}

//FUCK
//씨발