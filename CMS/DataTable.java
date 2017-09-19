import java.util.*;
/**
 * Write a description of class DataTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataTable
{
    private static List<Chair> chairList= new ArrayList<>();
    private static List<Author> authorList= new ArrayList<>();
    private static List<Reviewer> reviewerList= new ArrayList<>();
    
    public static List<Chair> getChairList()
    {
        return chairList;
    }
    
    public static List<Author> getAuthorList()
    {
        return authorList;
    }
    
    public static List<Reviewer> getReviewerList()
    {
        return reviewerList;
    }
}
