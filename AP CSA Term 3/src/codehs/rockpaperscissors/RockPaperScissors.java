package codehs.rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";

    public static final Scanner in = new Scanner(System.in);

    public static String getWinner(String user, String computer)
    {
        if(user.equals(computer)) {
            return TIE;
        } else if((user.equalsIgnoreCase("rock") && computer.equalsIgnoreCase("paper")) || (user.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("rock")) || (user.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("scissors"))) {
            return COMPUTER_PLAYER;
        } else {
            return USER_PLAYER;
        }
    }

    public static String input;

    public static void printWinner() {
        System.out.println("Enter your choice (rock, paper, or scissors): ");
        input = in.nextLine();
        String computer = " ";
        int choice = Randomizer.nextInt(1, 4);
        if(choice == 1) {
            computer = "Rock";
        } else if(choice == 2) {
            computer = "Scissors";
        } else {
            computer = "Paper";
        }

        System.out.println("User: " + input);
        System.out.println("Computer: " + computer);
        System.out.println(getWinner(input, computer));
    }

    public static void main(String[] args) {
        boolean loop = true;
        while(loop)
        {
            printWinner();

            if(in.equals(""))
            {
                in.close();
                break;
            }
            else
            {
                printWinner();;
            }
        }
    }
}
