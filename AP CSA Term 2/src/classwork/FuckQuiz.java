package classwork;

public class FuckQuiz {
	public static void main(String[] args)
	{
		System.out.println(FuckQuiz.theEnd("Hello", true));
		System.out.println(FuckQuiz.theEnd("Hello", false));
		System.out.println(FuckQuiz.theEnd("oh", true));
	}
	
	public static String theEnd(String str, boolean front) {
		if(front) {
			return str.substring(0,1);
		} else {
			return str.substring(str.length()-1);
		}
	}
}
