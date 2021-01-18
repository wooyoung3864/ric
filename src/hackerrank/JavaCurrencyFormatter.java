package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

         Locale in = new Locale("en", "IN");
         
         NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
         NumberFormat india = NumberFormat.getCurrencyInstance(in);
         NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
         NumberFormat france  = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
