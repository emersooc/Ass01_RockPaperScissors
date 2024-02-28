import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        boolean done = false; //boolean to control while loop
        String plAMove = ""; //player A move
        String plBMove = ""; //player B move
        String again = ""; //play again variable

        do
        {
            do
            {
                Scanner userInput = new Scanner(System.in); //creates scanner object
                System.out.println("Player A's move(R,P,S): ");

                if (userInput.hasNextLine()) //tests if input is a string
                {
                    plAMove = userInput.nextLine(); //assigns input to variable
                    if (plAMove.equalsIgnoreCase("R") || plAMove.equalsIgnoreCase("P") || plAMove.equalsIgnoreCase("S")) //tests if move is valid
                    {
                        done = true; //reassigns boolean to exit loop
                    }
                    else
                    {
                        System.out.println("Invalid move");
                    }
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
            while (!done);

            done = false; //resets boolean to false
            do
            {
                Scanner userInput = new Scanner(System.in); //creates scanner object
                System.out.println("Player B's move(R,P,S): ");

                if (userInput.hasNextLine()) //tests if input is a string
                {
                    plBMove = userInput.nextLine(); //assigns input to variable
                    if (plBMove.equalsIgnoreCase("R") || plBMove.equalsIgnoreCase("P") || plBMove.equalsIgnoreCase("S")) //tests if move is valid
                    {
                        done = true; //reassigns boolean to exit loop
                    }
                    else
                    {
                        System.out.println("Invalid move");
                    }
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
            while (!done);

            //actual game comparing the 2 players' moves
            if (plAMove.equalsIgnoreCase("R"))
            {
                if (plBMove.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie!");
                }
                else if (plBMove.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock, Player B wins!");
                }
                else
                {
                    System.out.println("Rock crushes Scissors, Player A wins!");
                }
            }
            else if (plAMove.equalsIgnoreCase("P"))
            {
                if (plBMove.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock, Player A wins!");
                }
                else if (plBMove.equalsIgnoreCase("P"))
                {
                    System.out.println("It's a tie!");
                }
                else
                {
                    System.out.println("Scissors cuts Paper, Player B wins!");
                }
            }
            else
            {
                if (plBMove.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock crushes Scissors, Player B wins!");
                }
                else if (plBMove.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cuts Paper, Player A wins!");
                }
                else
                {
                    System.out.println("It's a tie!");
                }
            }

            //play again prompt
            Scanner userInput = new Scanner(System.in);
            System.out.println("Would you like to play again?[Y/N] ");

            done = false; //resets boolean to false
            do
            {
                if (userInput.hasNextLine())
                {
                    again = userInput.nextLine();
                    if (again.equalsIgnoreCase("Y") || again.equalsIgnoreCase("N"))
                    {
                        done = true;
                    }
                    else
                    {
                        System.out.println("Not a valid answer");
                    }
                }
                else
                {
                    System.out.println("Not a valid input");
                }
            }
            while (!done);
        }
        while (again.equalsIgnoreCase("Y"));
    }
}