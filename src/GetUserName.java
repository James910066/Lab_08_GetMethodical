import java.util.Scanner; //Import of Scanner

public class GetUserName
{
    //Program 01 GetUserName
    public static void main(String[] args)
    {   //Declaration and assignment of variables
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name"); //Prompt user for input and setting that to variable string length is not = 0
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name"); //Prompt user for input and setting that to variable string length is not = 0
        System.out.println("\nYour full name is: " + firstName + " " + lastName); //Output statement with user's name
    }
}
