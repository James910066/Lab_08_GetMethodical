
import java.util.Locale; //Had to import this for the upper case function
import java.util.Scanner;
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

        switch(menuChoice)
            {
                case "O":
                System.out.println("You chose Open ");
                break;
                case "S":
                System.out.println("You chose Save ");
                break;
                case "V":
                System.out.println("You chose View ");
                break;
                case "Q":
                System.out.println("You chose quit ");
                break;
            }
    }
}
