import java.util.*;
/**
 * Write a description of class DataTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataTable
{
    private static List<User> userList = new ArrayList<>();
    private static List<Conference> conferenceList = new ArrayList<>();
    private static List<Paper> paperList = new ArrayList<>();
    private static List<Review> reviewList = new ArrayList<>();
    
    public static List<User> getUserList()
    {
        return userList;
    }
    
    public static List<Conference> getConferenceList()
    {
        return conferenceList;
    }
    
    public static List<Paper> getPaperList()
    {
        return paperList;
    }
    
    public static List<Review> getReviewList()
    {
        return reviewList;
    }
}
