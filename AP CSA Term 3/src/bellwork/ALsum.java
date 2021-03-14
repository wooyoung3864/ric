package bellwork;
import java.util.ArrayList;
import java.util.Scanner;
public class ALsum {
    public static final Scanner in = new Scanner(System.in);
    public static ArrayList<Integer> nums = new ArrayList<Integer>();
    public static void addToAL() {
        boolean cont = true;
        while(cont) {
            System.out.println("Would you like to enter in numbers to the list?");
            String input = in.next();
            Integer num;
            if(input.equalsIgnoreCase("yes")) {
                System.out.println("Enter the number you wish to add");
                num = in.nextInt();
                nums.add(num);
            } else if(input.equalsIgnoreCase("no")) {
                cont = false;
            }
        }
    }

    public static void getALSumAndProduct() {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < nums.size(); ++i) {
            sum += nums.get(i);
            product *= nums.get(i);
        }
        System.out.println("The sum of the list is: " + sum);
        System.out.println("The product of the list is: " + product);
    }

    public static void printAL() {
        System.out.println(nums);
    }

    public static void main(String[] args) {
        addToAL();
        printAL();
        getALSumAndProduct();
    }
}
