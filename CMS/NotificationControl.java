
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
        for(Author author:DataTable.getAuthorList())
        {
            author.getNotificationList().add(message);
        }
    }
}
