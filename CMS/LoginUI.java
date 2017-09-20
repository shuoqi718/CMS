import java.util.*;
/**
 * Write a description of class LoginUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoginUI
{
    private LoginControl loginControl;
    private ChairMenuUI chairMenu;
    private AuthorMenuUI authorMenu;
    private ReviewerMenuUI reviewerMenu;
    public LoginUI()
    {
        loginControl = new LoginControl();
        chairMenu = new ChairMenuUI();
        authorMenu = new AuthorMenuUI();
        reviewerMenu = new ReviewerMenuUI();
    }
    
    public void login()
    {
        String choice = "";
        Scanner input = new Scanner(System.in);
        roleMenu();
        choice = acceptRole();
        switch(choice)
        {
            case "1":
                if(loginControl.userConfirmed("chair"))
                    chairMenu.chairSubSystem();
                else
                    System.out.println("Username/password wrong!");
                break;
            case "2":
                if(loginControl.userConfirmed("author"))
                    authorMenu.authorSubSystem();
                else
                    System.out.println("Username/password wrong!");
                break;
            case "3":
                if(loginControl.userConfirmed("reviewer"))
                    reviewerMenu.reviewerSubSystem();
                else
                    System.out.println("Username/password wrong!");
                break;
            default:System.out.println("Please enter correct number!");
        }
    }
    
    private void roleMenu()
    {
        System.out.println("===============================");
        System.out.println("1.Chair");
        System.out.println("2.Author");
        System.out.println("3.Reviewer");
        System.out.println("Please enter your role:");
    }
    
    private String acceptRole()
    {
        String choice = "";
        Scanner input = new Scanner(System.in);
        choice = input.nextLine();
        return choice;
    }
}
