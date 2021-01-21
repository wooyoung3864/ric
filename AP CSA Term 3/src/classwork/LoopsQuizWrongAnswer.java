package classwork;
import java.util.Scanner;
public class LoopsQuizWrongAnswer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = in.nextLine();
        System.out.println(oddEvenZero(num));

    }

    public static String oddEvenZero(String num) {
        int even = 0, odd = 0, zero = 0;
        for(int i = 0; i < num.length(); ++i) {
            String part = num.substring(i , i+1);
            int digit = Integer.parseInt(part);

            if(digit % 2 == 0) {
                ++even;
            } else if(digit % 2 == 1) {
                ++odd;
            } else {
                ++zero;
            }
        }
        return "Number of even digits: " + even + "\n" + "Number of odd digits: " + odd + "\n" + "Number of zero digits: " + zero;
    }
}

