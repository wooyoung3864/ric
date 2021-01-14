package classwork;
import java.util.Scanner;
// ****************************************************************
//   LoveCS.java
//   Use a while loop to print many messages declaring your
//   passion for computer science
// ****************************************************************

public class LoveCS {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        final int LIMIT = 10;
        int count = 1;
        int sum = 0;
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        while (count <= num) {
            System.out.println(count + " I love Computer Science!!");
            sum += count;
            count++;
        }
        System.out.println("Printed this message " + num + " times. ");
        System.out.println("The sum of the numbers from 1 to " + num + " is " + sum);
    }
}