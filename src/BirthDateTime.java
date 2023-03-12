import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {   //Assignment and declarion of all variables
        int menuChoice = 0;
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        int birthYear = 0;
        int birthHour = 0;
        int birthMinute = 0;
        int birthDay = 0;
        final int LOW_VALUE = 1; //Variable used for range getting birthday. Low value will always be a 1
        int highValue = 0; //Variable used for range getting birthday. Value is determined by CASE statement

        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month ", 1, 12); //Get birth month using method range
        birthYear = SafeInput.getRangedInt(in, "Enter your birth year ", 1950, 2010); //Get birth year using method range
        birthHour = SafeInput.getRangedInt(in, "Enter your birth hour ", 1, 24); //Get birth hour using method range
        birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute ", 1, 59); //Get birth minute using method range

        menuChoice = birthMonth; //Assign chose birth month to menu for the CASE statements

        switch(menuChoice) //Values for Case statements
        {
            case 2: //February
              highValue = 28; //Maximum value previous month can be
                break; //Jump out of switch
            case 4: //April
            case 5: //May
            case 6: //June
            case 9: //September
            case 11: //November
                highValue = 30; //Maximum value previous months can be
                break; //Jump out of switch
            case 1: //January
            case 3: //March
            case 7: //July
            case 8: //August
            case 10: //October
            case 12: //December
                highValue = 31; //Maximum value previous months can be
                break; //Jump out of switch

        }
        birthDay = SafeInput.getRangedInt(in, "Enter your birth day ", LOW_VALUE, highValue); //Get birthday using method range
        //Single output of all inputs back to user with each on its own line
        System.out.println("Your birth month is " + birthMonth + "\nYour birth year is " + birthYear + "\nYour birth hour is " + birthHour + "\nYour birth minute is " + birthMinute + "\nYour birthday is " + birthDay);

    }
}
