package hackerrank;
import java.util.Scanner;
public class JavaOutputFormatting {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;++i)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
               if(x <= 9) {
            	   System.out.println(s1 + "\t 00" + x);
                } else if(x <= 99) {
                	System.out.println(s1 + "\t 0" + x);
                }else if(x >= 100) {
                	System.out.println(s1 + "\t" + x);
                }
            }
            System.out.println("================================");
    }
}