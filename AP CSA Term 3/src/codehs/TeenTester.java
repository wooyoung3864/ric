package codehs;
import java.util.Scanner;
public class TeenTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10, true);
        System.out.println(myFriend.toString());

        // Ask the user to input a text message
        System.out.println("Type a message: ");
        String text = in.nextLine();
        //Call teenTalk method to translate the message to teen talk
        System.out.println(myFriend.teenTalk(text));
    }
}

