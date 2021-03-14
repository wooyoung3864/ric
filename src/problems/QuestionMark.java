package problems;
import java.util.Scanner;
public class QuestionMark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(input.equalsIgnoreCase("Bruh") ? "Yes" : "No");
        in.close();
    }
}
