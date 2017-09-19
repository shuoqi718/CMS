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
    private List<Review> reviewList;
    public Paper(String title)
    {
        reviewList = new ArrayList<>();
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
    
    public List<Review> getReviewList()
    {
        return reviewList;
    }
    
    public void setFinalDecision(String finalDecision)
    {
        this.finalDecision = finalDecision;
    }
}
