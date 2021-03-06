import java.util.*;
/**
 * Write a description of class Register here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Register
{
    private RegisterControl registerControl;
    public Register()
    {
        registerControl = new RegisterControl();
    }
    
    public void register()
    {
        String choice = "";
        roleMenu();
        choice = chooseRole();
        switch(choice)
        {
            case "1": DataTable.getChairList().add(registerControl.addChair());break;
            case "2": DataTable.getAuthorList().add(registerControl.addAuthor());break;
            case "3": DataTable.getReviewerList().add(registerControl.addReviewer());break;
            default: System.out.println("Please enter correct number!");
        }
    }
    
    private void roleMenu()
    {
        System.out.println("===============================");
        System.out.println("1.Chair");
        System.out.println("2.Author");
        System.out.println("3.Review");
        System.out.print("Please choose your role:");
    }
    
    private String chooseRole()
    {
        String choice = "";
        Scanner input = new Scanner(System.in);
        choice = input.nextLine();
        return choice;
    }
}
