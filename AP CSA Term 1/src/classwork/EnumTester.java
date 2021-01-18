package classwork;

public class EnumTester {
		enum Flavor {vanilla, chocolate, strawberry, lime}
		public static void main(String[] args)
		{
			Flavor cone1, cone2, cone3;
			
			cone1 = Flavor.chocolate;
			cone2 = Flavor.vanilla;
			
			System.out.println("Cone 1: " + cone1);
			System.out.println("Cone 2: " + cone2);
			
			cone3 = cone1;
			
			System.out.println("Cone 3: " + cone3);
			
		}
}
