import java.util.*;
/**
 * Write a description of class RegisterControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegisterControl
{
    public Chair addChair()
    {
        String username = "";
        String password = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username:");
        username = input.nextLine();
        System.out.print("Please enter your password:");
        password = input.nextLine();
        return new Chair(username,password);
    }
    
    public Author addAuthor()
    {
        String username = "";
        String password = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username:");
        username = input.nextLine();
        System.out.print("Please enter your password:");
        password = input.nextLine();
        return new Author(username,password);
    }
    
    public Reviewer addReviewer()
    {
        String username = "";
        String password = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username:");
        username = input.nextLine();
        System.out.print("Please enter your password:");
        password = input.nextLine();
        return new Reviewer(username,password);
    }
}
