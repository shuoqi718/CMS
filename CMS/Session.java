
/**
 * Write a description of class Session here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Session
{
    private static User currentUser;
    
    public static User getCurrentUser()
    {
        return currentUser;
    }
    
    public static void setCurrentUser(User user)
    {
        currentUser = user;
    }
}
