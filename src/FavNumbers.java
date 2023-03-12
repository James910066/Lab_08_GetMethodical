import java.util.Scanner; //Import of Scanner Utility
public class FavNumbers
{
    public static void main(String[] args)
    {   //Declaration and assignment of variables
        Scanner in = new Scanner(System.in);
        int favNum = 0;
        double favDouble = 0.0;
        //String trash = "";

        //Test getInt method
        favNum = SafeInput.getInt(in, "Enter your favorite number "); //Prompt user for an integer and assign value to variable
        System.out.print(favNum + " is your favorite number"); //Output statement

         //Test getDouble method
        favDouble = SafeInput.getDouble(in, "Enter your favorite number with decimal"); //Prompt user for a double/decimal value and assign value to variable
        System.out.print(favDouble + " is your favorite number with decimal"); //Output statement
    }
}
