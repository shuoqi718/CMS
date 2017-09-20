import java.util.*;
/**
 * Write a description of class LoginControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoginControl
{
    public boolean userConfirmed(String role)
    {
        String username = "";
        String password = "";
        Scanner  input = new Scanner(System.in);
        System.out.print("Please enter your username:");
        username = input.nextLine();
        System.out.print("Please enter your password:");
        password = input.nextLine();
        for(User user:DataTable.getUserList())
        {
            if(user.getUsername().equals(username) &&
               user.getPassword().equals(password) &&
               user.getRole().equals(role))
            {
                Session.setCurrentUser(user);
                return true;
            }
        }
        return false;
    }
}
