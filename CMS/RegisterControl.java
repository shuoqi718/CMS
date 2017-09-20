import java.util.*;
/**
 * Write a description of class RegisterControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RegisterControl
{
    public User addUser(String role)
    {
        String username = "";
        String password = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username:");
        username = input.nextLine();
        System.out.print("Please enter your password:");
        password = input.nextLine();
        return new User(username,password,role);
    }
}
