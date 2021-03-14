package problems;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SecretInstructions {
    public static final Scanner in = new Scanner(System.in);
    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        decodeInstructions();
    }
    public static void decodeInstructions() {
        ArrayList<String> inputs = new ArrayList<String>();
        ArrayList<String> outputs = new ArrayList<String>();
        System.out.println("Enter a number (enter 99999 to quit): ");
        String input = in.nextLine();
        String direction = "";
        while(!input.equals("99999")) {
                inputs.add(input);
            if(input.equals("99999"))
                break;
        }

        for(int i = 0; i < inputs.size(); ++i) {
            String tempDir = direction;
            String temp = inputs.get(i);
            int firstDigit = Integer.parseInt(temp.substring(0,1));
            int secondDigit = Integer.parseInt(temp.substring(1,2));
            String lastThreeDigits = temp.substring(2);

            int dirNum = firstDigit + secondDigit;
            if(dirNum % 2 == 1) {
                direction = "left ";
            } else if(dirNum % 2 == 0) {
                direction = "right ";
            } else if (dirNum == 0){
                direction = tempDir;
            }

            outputs.add(direction + lastThreeDigits);
        }

        for(String val : outputs) {
            System.out.println(val);
        }
    }
}

/*
sequence of five digits, represents a direction to turn and the number of steps to take.
first two digits represent the direction to turn:
• If their sum is odd, then the direction to turn is left.
• If their sum is even and not zero, then the direction to turn is right.
• If their sum is zero, then the direction to turn is the same as the previous instruction.
remaining three digits represent the number of steps to take which will always be at least 100.
decode the instructions so the assistant can use them to find the secret formula.
at least two lines of input. Each line except the last line will contain exactly five digits representing an instruction. The first line will not begin with 00. The last line will contain 99999 and no other line will contain 99999.
Output Specification
There must be one line of output for each line of input except the last line of input. These output lines correspond to the input lines (in order). Each output line gives the decoding of the corresponding instruction: either right or left, followed by a single space, followed by the number of steps to be taken in that direction.
Sample Input
57234
00907
34100
99999
Output for Sample Input
right 234
right 907
left 100

Explanation of Output for Sample Input
The first instruction is 57234 which is decoded as right 234 because 5 + 7 = 12 which is even and 57 is followed by 234.
The second instruction is 00907 which is decoded with the same direction as the previous instruction (right) but with 907 steps.
The third instruction is 34100 which is decoded as left 100 because 3 + 4 = 7 which is odd and 34 is followed by 100.
The last line contains 99999 which tells us these are the only three instructions.
 */
