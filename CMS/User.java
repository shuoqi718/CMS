import java.util.*;
/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User
{
    private String username;
    private String password;
    private String role;
    private List<String> notification;
    
    public User(String username, String password, String role)
    {
        this.username = username;
        this.password = password;
        this.role = role;
        notification = new ArrayList<>();
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getRole()
    {
        return role;
    }
    
    public List<String> getNotification()
    {
        return notification;
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
