package ric;
import java.util.Scanner;
public class Nice {
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        for(int i = 0; i <= num; ++i) System.out.println("Nice");
    }
}
