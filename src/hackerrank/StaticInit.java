package hackerrank;
import java.util.Scanner;
public class StaticInit {
	public static final Scanner in  = new Scanner(System.in);
	static int B = in.nextInt();
	static int H = in.nextInt();
	static boolean flag  = true;
	
	static {
		try {
			if(B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		if(flag) {
			int area  = B * H;
			System.out.println(area);
		}
	}
}
