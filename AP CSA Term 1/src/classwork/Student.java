package classwork;

public class Student {
		private String name;
		private int score1;
		private int score2;
		
		
		public Student(String studentName)
		{
			name = studentName;
		}
		
		public void inputGrades(int x, int y)
		{
			score1 = x;
			score2 = y;
		}
		
		public int getAverage()
		{
			return((score1+score2)/2);
		}
		
		public String getName()
		{
			return name;
		}
		
		public String toString()
		{
			return("Name: " + name + "\nTest1: " + score1 +  "\nTest2: " + score2 + "\nAverage: " + getAverage());
		}
}
