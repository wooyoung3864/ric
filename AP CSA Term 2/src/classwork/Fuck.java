package classwork;

public class Fuck {
	public static void main(String[] args) {
		String park = "Mr. Park";
		String park2 = park;
		String hyon = "Dumbasss";
		
		int comp = park.compareTo(park2);
		System.out.println(comp);
		
		System.out.println(park.length());
		
		String newString = hyon.substring(3);
		System.out.println(newString);
		newString = hyon.substring(0,4);
		System.out.println(newString);
		
		System.out.println(hyon.indexOf("D"));
		
		System.out.println(park.equals(park2));
		
		System.out.println(park.compareTo(hyon));
		
	}
}
