import java.util.Scanner;

public class DevTest
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("You played a game ");
        SafeInput.getYNConfirm(in,"Want to play again? ");
    }


   /* public static void main(String[] args)
    {
        int favNum = 0;
        Scanner in = new Scanner(System.in);

        favNum = SafeInput.getRangedInt(in, "What is your favorite number? ", 1, 10);
        System.out.println("You said your favorite number is " + favNum);


    }*/
    //Program 01 GetUserName
   /* public class GetUserName
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            String firstName = "";
            String lastName = "";
            firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
            lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
            System.out.println("\nYour full name is: " + firstName + " " + lastName);
        }
    }*/

}
