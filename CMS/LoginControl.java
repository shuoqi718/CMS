import java.util.*;
/**
 * Write a description of class LoginControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoginControl
{
    public boolean chairConfirmed()
    {
        String username = "";
        String password = "";
        Scanner  input = new Scanner(System.in);
        System.out.print("Please enter your username:");
        username = input.nextLine();
        System.out.print("Please enter your password:");
        password = input.nextLine();
        for(Chair chair:DataTable.getChairList())
        {
            if(chair.getUsername().equals(username)&&chair.getPassword().equals(password))
            {
                Session.setCurrentChair(chair);
                return true;
            }
        }
        return false;
    }
    
    public boolean authorConfirmed()
    {
        String username = "";
        String password = "";
        Scanner  input = new Scanner(System.in);
        System.out.print("Please enter your username:");
        username = input.nextLine();
        System.out.print("Please enter your password:");
        password = input.nextLine();
        for(Author author:DataTable.getAuthorList())
        {
            if(author.getUsername().equals(username)&&author.getPassword().equals(password))
                return true;
        }
        return false;
    }
    
    public boolean reviewerConfirmed()
    {
        String username = "";
        String password = "";
        Scanner  input = new Scanner(System.in);
        System.out.print("Please enter your username:");
        username = input.nextLine();
        System.out.print("Please enter your password:");
        password = input.nextLine();
        for(Reviewer reviewer:DataTable.getReviewerList())
        {
            if(reviewer.getUsername().equals(username)&&reviewer.getPassword().equals(password))
                return true;
        }
        return false;
    }
}
