package classwork;
import java.util.Scanner;
public class BMI {
	public static final Scanner in = new Scanner(System.in);
	
	public static double bmi(double height, double weight) {
		return Math.round((weight / Math.pow(height, 2)) * 703)*100/100;
		
	}
	
	public static String weightClass(double height, double weight) {
		double bmi  = bmi(height, weight);
		if(bmi < 18.5) {
			return "Underweight";
		}
        else if(bmi >= 18.5 && bmi < 25) {
        	return "Normal";
        }
        else if(bmi >= 25 && bmi < 30) {
        	return "Overweight";
        }
        return "Obese";
	}
	
	public static void main(String[] args) {
		System.out.println("Enter height in inches: ");
		double height = in.nextDouble();
		System.out.println("Enter weight in pounds: ");
		double weight = in.nextDouble();
		
		System.out.println("BMI: " + bmi(height, weight));
		System.out.println(weightClass(height, weight));
	}
}
