package homework;
public class Pythagorean {
		public void hypotenuse(double sideOne, double sideTwo)
		{
			sideOne = Math.pow(sideOne, 2);
			sideTwo = Math.pow(sideTwo,  2);
			double sideThree = Math.sqrt(sideOne + sideTwo);
		}
		
		public void length(double sideOne, double sideTwo)
		{
			sideOne = Math.pow(sideOne, 2);
			sideTwo = Math.pow(sideTwo,  2);
			double sideThree = Math.sqrt(sideOne - sideTwo);
		}
}
