package codehs;
import java.util.Scanner;
public class PasswordChecker
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        System.out.println("Enter password: ");
        String pw = in.nextLine();
        in.close();
        //boolean isValid = passwordCheck(pw);
        System.out.println(passwordCheck(pw));
    }

    public static boolean passwordCheck(String password)
    {
        String digit = "123456789";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String pw = password.toLowerCase();

        if(password.length() > 8) {
            for(int i = 0; i < password.length(); ++i) {
                if(!digit.contains(pw.substring(i, i + 1)) && !alpha.contains(pw.substring(i, i + 1))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
