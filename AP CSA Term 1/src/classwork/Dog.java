package classwork;

public class Dog {
		int size = 25;
		String breed = "Maltese";
		String name = "Toto";
		
		public Dog()
		{
			size = 30;
			breed = "Pekingese";
			name = "Tory";			
		}
		
		
		
		void bark()
		{
			System.out.println("야!! 개짖는소리좀 안나게하라!!!");
		}
		
		void print()
		{
			System.out.println("Name : " + name + "\nBreed: " + breed + "\nSize: " + size);
		}
}
