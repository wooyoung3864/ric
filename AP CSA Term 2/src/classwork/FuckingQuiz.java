package classwork;

public class FuckingQuiz {
	public static void main(String[] args)
	{
		System.out.println(FuckingQuiz.randomCard());
	}
	
	public static String randomCard() 
	{
		int first = (int) (Math.random()*12) +1;
		int second = (int) (Math.random()*12) + 1;
		String card = "Your first card is " + first + "\nYour second card is " + second;
		return card;
	}
}
