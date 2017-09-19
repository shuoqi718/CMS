import java.util.*;
/**
 * Write a description of class Chair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chair
{
    private String username;
    private String password;
    private List<Conference> conferenceList;
    
    public Chair(String username, String password)
    {
        this.username = username;
        this.password = password;
        conferenceList = new ArrayList<>();
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public List<Conference> getConferenceList()
    {
        return conferenceList;
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
