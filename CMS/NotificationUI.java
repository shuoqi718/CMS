import java.util.*;
/**
 * Write a description of class NotificationUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NotificationUI
{
    private NotificationControl notificationControl;
    public NotificationUI()
    {
        notificationControl = new NotificationControl();
    }
    
    public void sendNotification()
    {
        String message = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your message:");
        message = input.nextLine();
        notificationControl.addNotification(message);
        System.out.println("Congratulations, message has been sent!");
    }
}
