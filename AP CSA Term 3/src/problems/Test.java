package problems;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int firstDigit = Integer.parseInt(input.substring(0,1));
        int secondDigit = Integer.parseInt(input.substring(1,2));

        String lastThreeDigits = input.substring(2);
        String direction = "";
        String tempDir = "";
        int dirNum = firstDigit + secondDigit;
        if(dirNum % 2 == 1) {
            direction = "left ";
        } else if(dirNum % 2 == 0) {
            direction = "right ";
        } else if (dirNum == 0){
            direction = tempDir;
        }
        System.out.println(direction + lastThreeDigits);
    }
}
