
/**
 * Write a description of class CreateConferenceUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreateConferenceUI
{
    private CreateConferenceControl createControl;
    public CreateConferenceUI()
    {
        createControl = new CreateConferenceControl();
    }
    
    public void createConference()
    {
        System.out.println("=======================");
        createControl.addConference();
        System.out.println("Congratulations!Creation complete!");
    }
}
