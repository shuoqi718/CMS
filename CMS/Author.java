import java.util.*;
/**
 * Write a description of class Author here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Author
{
    private String username;
    private String password;
    private List<Paper> PaperList;
    private List<String> notificationList;
    
    public Author(String username, String password)
    {
        this.username = username;
        this.password = password;
        PaperList = new ArrayList<>();
        notificationList = new ArrayList<>();
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public List<Paper> getPaperList()
    {
        return PaperList;
    }
    
    public List<String> getNotificationList()
    {
        return notificationList;
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
