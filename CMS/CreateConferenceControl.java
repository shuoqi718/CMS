import java.util.*;
/**
 * Write a description of class CreateConferenceControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreateConferenceControl
{
    public void addConference()
    {
        String title = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter title:");
        title = input.nextLine();
        Session.getCurrentChair().getConferenceList().add(new Conference(title));
    }
}
