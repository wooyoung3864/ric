package classwork;
import java.util.Scanner;
public class TripleDouble {

	public static boolean tenPts;
	public static boolean tenRebs;
	public static boolean tenAsst;
	public static boolean tripleDouble;
	public static String td; 
	
	public static String isTripleDouble(int points, int rebounds, int assists)
	{
		tenPts = points >= 10;
		tenRebs = rebounds >= 10;
		tenAsst = assists >= 10;
		
		System.out.println("You got 10 or more points: " + tenPts);
		System.out.println("You got 10 or more rebounds: " + tenRebs);
		System.out.println("You got 10 or more assists: " + tenAsst);
		
		if(tenPts == true && tenRebs == true && tenAsst == true) {
			tripleDouble = true;
		} else {
			tripleDouble = false;
		}
		
		if(tripleDouble == true)
		{
			td = "Yes!!";
		} else {
			td = "no dipshit";
		}
		System.out.println();
		return "Is it a triple double? " + td;
	}
	
	public static void main(String[] args)
	{
		Scanner in  = new Scanner(System.in);
		
		System.out.println("How many points did you score?");
		int pts = in.nextInt();
		System.out.println("How many rebounds did you get?");
		int reb = in.nextInt();
		System.out.println("How many assists did you get?");
		int ass = in.nextInt();
		
		System.out.println(TripleDouble.isTripleDouble(pts, reb, ass));
	}
}
