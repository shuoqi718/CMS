
/**
 * Write a description of class NotificationControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NotificationControl
{
    public void addNotification(String message)
    {
        for(User user : DataTable.getUserList())
        {
            if(user.getRole().equals("author"))
                user.getNotification().add(message);
        }
    }
}
