import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        boolean done = false; //boolean to control while loop
        String plAMove; //player A move
        String plBMove; //player B move

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
    }
}