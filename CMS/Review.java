
/**
 * Write a description of class Review here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Review
{
    private User user;
    private String title;
    private Paper paper;
    public Review(String title, User user, Paper paper)
    {
        this.user = user;
        this.title = title;
        this.paper = paper;
    }
    
    public User getUser()
    {
        return user;
    }
    
    public Paper getPaper()
    {
        return paper;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
}
