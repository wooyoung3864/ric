package classwork;
public class SnkrTester {
	public static void main(String[] args)
	{
		Snkrs af1 = new Snkrs();
		Snkrs yzy = new Snkrs("Yeezy Boost 350 V2", "adidas", 9.5, "Cream White");
		Snkrs vans = new Snkrs("Vans Era ComfyCush", "Vans", 9.5, "Black");	
		vans.changeSize(8.5);
		vans.changeColor("White");
		
		System.out.println(af1);
		System.out.println(yzy);
		System.out.println(vans);
		
	}
}
