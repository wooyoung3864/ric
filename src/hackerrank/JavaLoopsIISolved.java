package hackerrank;
import java.util.Scanner;
public class JavaLoopsIISolved {
	public static final Scanner in = new Scanner(System.in);	
	public static void main(String[] args) {
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = a;
            for(int j = 0; j < n; ++j) {
            	temp += (int) (Math.pow(2, j)  * b);
            	System.out.print(Integer.toString(temp )+ " ");
            }
            System.out.print('\n');
        }
        in.close();
	}
}
