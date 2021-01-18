package classwork;

public class NameThatStringActivity {
	public static void main(String[] args)
	{
		String akumpo = "Giannis Antetokounmpo";
		
		System.out.println(akumpo.length());
		System.out.println(akumpo.charAt(20));
		System.out.println(akumpo.charAt(6));
		System.out.println(akumpo.indexOf("Ant"));
		System.out.println(akumpo.replaceAll("o", "#"));
		System.out.println(akumpo.substring(5));
		System.out.println(akumpo.substring(3,8));
		System.out.println(akumpo.substring(7,12));
		
		int lastInt = akumpo.length()-1;
		char lastChar = akumpo.charAt(lastInt);
		System.out.println(akumpo.indexOf(lastChar));
	}
}
