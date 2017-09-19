import java.util.*;
/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu
{
    public void displayMainMenu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Welcome to the Demo System");
        System.out.println("1.Regsiter");
        System.out.println("2.Login");
        System.out.println("3.exit");
        System.out.print("Please enter your choice:");
    }
    
    public String acceptChoice()
    {
        Scanner input = new Scanner(System.in);
        String choice = "";
        choice = input.nextLine();
        return choice;
    }
}
