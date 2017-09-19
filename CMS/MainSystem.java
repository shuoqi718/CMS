import java.util.*;
import java.io.*;
import java.lang.*;
/**
 * Write a description of class MainSystem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainSystem
{
    private MainMenu mainMenu;
    private Register register;
    private LoginUI login;
    public MainSystem()
    {
        mainMenu = new MainMenu();
        register = new Register();
        login = new LoginUI();
    }
    
    public void startProject()
    {
        String choice = "";
        Scanner input = new Scanner(System.in);
        while(!choice.equals("3"))
        {
            mainMenu.displayMainMenu();
            choice = mainMenu.acceptChoice();
            switch(choice)
            {
                case "1":register.register();break;
                case "2":login.login();break;
                case "3":System.out.println("Thank You for Using the System!");break;
                default:System.out.println("Please enter correct number");
            }
            System.out.print("Please press [enter] to continue.");
            input.nextLine();
            System.out.println("\u000C");
        }
    }
}
