package classwork;

public class MicrowaveCooking {
	public static void main(String[] args)
	{
		int cookingTime = (int) (Math.random() * 60);
		
		System.out.println(cookingTime);
		System.out.println();
		
		if(cookingTime <= 20 && cookingTime > 15)
		{
			System.out.println("Perfect cooking time!");
		} else {
			System.out.println("Your roll will catch fire!");
		}
	}
}
