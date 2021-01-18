package classwork;

public class StringObjects {
	public static void main(String[] args)
	{
		String str1 = "Welcome to AP CSA!";
		String str2 = new String(" The CSA exam is on May 6th.");
		String str3 = new String(str2);
		
		String str4 = new String();
		str4 = str1 + str3;
		
		System.out.println(str4);
		
		//escape sequences
		System.out.println("\\ displays  \"quotes \" as symbol rather than indicating text"); 
		//System.out.println("\' displays \ 'single\' quote character");
	}
}

/*
package classwork;

public class StringObjects {
	public static void main(String[] args)
	{
		String str1 = "Welcome to AP CSA!";
		String str2 = new String(" The CSA exam is on May 6th.");
		String str3 = new String(str2);
		
		String str4 = new String();
		str4 = str1 + str3;
		
		System.out.println(str4);
		
		//escape sequences
		System.out.println("\\ displays  \"quotes\ " as symbol rather than indicating text");
		System.out.println("\' displays \ 'single\' quote character");
	}
}
*/