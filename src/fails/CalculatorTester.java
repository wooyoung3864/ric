package fails;

import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.println("Enter first number: ");
        double firstNum = in.nextDouble();
        
        System.out.println("Enter second number: ");
        double secondNum = in.nextDouble();
        
        System.out.println("Choose an operation (+, -, *, /)");
        String operation = in.nextLine();     
        
        in.close();
        
        if(operation == "+")
        {
        	calc.sum(firstNum, secondNum);
        }
        else if(operation == "-")
        {
        	calc.subtract(firstNum, secondNum);
        }
        else if(operation == "*")
        {
        	calc.multiply(firstNum, secondNum);
        }
        else if(operation == "/")
        {
        	calc.divide(firstNum, secondNum);
        }
      }
}
