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
    private List<Paper> paperList;
    public Conference(String title)
    {
        paperList = new ArrayList<>();
        this.title = title;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public List<Paper> getPaperList()
    {
        return paperList;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
}
