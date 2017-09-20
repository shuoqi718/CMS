import java.util.*;
/**
 * Write a description of class Paper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paper
{
    private String title;
    private String finalDecision;
    private User user;
    private Conference conference;
    public Paper(String title, User user, Conference conference)
    {
        this.user = user;
        this.conference = conference;
        this.title = title;
        finalDecision = "";
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getFinalDecision()
    {
        return finalDecision;
    }
    
    public User getUser()
    {
        return user;
    }
    
    public Conference getConference()
    {
        return conference;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setFinalDecision(String finalDecision)
    {
        this.finalDecision = finalDecision;
    }
}
