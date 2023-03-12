import java.util.Scanner; //Import of Scanner Utility
public class CheckOut
{
    public static void main(String[] args)
    {   //Declaration and assignment of variables
        double itemCost = 0;
        double totalCost = 0;
        Scanner in = new Scanner(System.in);
        boolean done = false;

        do //Start of loop for getting user item cost
        {
            itemCost = SafeInput.getRangedDouble(in, "Enter your item amount ", .50, 9.99); //Prompt user for price and assign value to variable if correct
            done = SafeInput.getYNConfirm(in, "Do you have more items to enter? "); //Prompt user if they have more items to enter. Assign value to variable if correct
            totalCost = totalCost + itemCost; //Totaling up cost of each item to final totalCost variable
        } while (!done); //Decision to continue loop for customer items based on user response
        System.out.printf("Your total cost of all items is " + "%5.2f", totalCost); //Output total cost of all items formatted to 2 decimals
    }
}
