import java.util.*;
/**
 * Write a description of class ChairMenuUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChairMenuUI
{
    private CreateConferenceUI createConference;
    private NotificationUI notificationUI;
    private ViewReviewUI viewReviewUI;
    public ChairMenuUI()
    {
        createConference = new CreateConferenceUI();
        notificationUI = new NotificationUI();
        viewReviewUI = new ViewReviewUI();
    }
    public void chairSubSystem()
    {
        String choice = "";
        Scanner input = new Scanner(System.in);
        while(!choice.equals("5"))
        {
            mainMenu();
            choice = input.nextLine();
            switch(choice)
            {
                case "1":createConference.createConference();break;
                case "2":notificationUI.sendNotification();break;
                case "3":viewReviewUI.viewReview();break;
                case "4":break;
                case "5": 
                    System.out.println("Thank you for using!");
                    Session.setCurrentChair(new Chair("",""));
                    return;
                default: System.out.println("Please enter correct number!");
            }
            System.out.print("Please press [enter] to continue.");
            input.nextLine();
            System.out.println("\u000C");
        }
    }
    
    private void mainMenu()
    {
        System.out.println("Welcome,chair!");
        System.out.println("1. Create Conference");
        System.out.println("2. Send Notification");
        System.out.println("3. View Reviews");
        System.out.println("4. Assign Reviewers");
        System.out.println("5. Log off");
        System.out.print("Please enter your choice:");
    }
    
    
}
