import java.util.*;
/**
 * Write a description of class Reviewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reviewer
{
    private String username;
    private String password;
    private List<Review> ReviewList;
    public Reviewer(String username, String password)
    {
        this.username = username;
        this.password = password;
        ReviewList = new ArrayList<>();
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public List<Review> getReviewList()
    {
        return ReviewList;
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
}
