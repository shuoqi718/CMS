import java.util.*;
/**
 * Write a description of class Conference here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conference
{
    private String title;
    private User user;
    public Conference(String title,User user)
    {
        this.user = user;
        this.title = title;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public User getUser()
    {
        return user;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
}
