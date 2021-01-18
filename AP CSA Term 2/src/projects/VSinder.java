package projects;
import java.util.Scanner;
public class VSinder {
	public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String myWord = in.nextLine();
		System.out.println(youAndI(myWord));
	}
	public static String youAndI(String myWord) {
		String pickupLine = "";
		try {
			if(myWord.contains("u") && myWord.contains("i")) {
				pickupLine = "You can't spell " + "\"" + myWord + "\"" + " without \"u\" and \"i\"";
 			}
		} catch(Exception e) {
			pickupLine = "Some letters seem to be missing here. Can yoU guess whIch one?";
		}
		return pickupLine;
	}
}
