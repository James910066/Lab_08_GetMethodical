
import java.util.Locale; //Had to import this for the upper case function
import java.util.Scanner; //Import of Scanner Utility
public class Reggie
{
    public static void main(String[] args)
    {   //Declaration and assignment of variables
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String mNumber = "";
        String menuChoice = "[O-open], [S-save], [V-view], [Q-quit]";

        SSN = SafeInput.getRegExString(in, "Enter your SSN ", "\\d{3}-\\d{2}-\\d{4}"); //Prompt user for their SSN and assign to variable if pattern matches
        System.out.println("Your SSN is " + SSN); //Output statement of users SSN

        mNumber = SafeInput.getRegExString(in, "Enter your UC Mnumber " , "(M|m)\\d{8}"); //Prompt user for the M number and assign to variable if pattern matches
        System.out.println("Your Mnumber is " + mNumber); //Output statement of users M number

        menuChoice = SafeInput.getRegExString(in, "Please make a choice " + menuChoice, "[OoSsVvQq]"); //Prompt user for menu choice
        menuChoice = menuChoice.toUpperCase(Locale.ROOT); //Convert user's choice to upper case if they enter lower case value

       switch(menuChoice) //Values for Case statements
            {
                case "O": //Open
                System.out.println("You chose Open "); //Output statement
                break; //Jump out of switch to main program
                case "S": //Save
                System.out.println("You chose Save "); //Output statement
                break; //Jump out of switch to main program
                case "V": //View
                System.out.println("You chose View "); //Output statement
                break; //Jump out of switch to main program
                case "Q": //Quit
                System.out.println("You chose quit "); //Output statement
                break; //Jump out of switch to main program
            }
    }
}
