import java.util.*;
/**
 * Write a description of class ViewReviewControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ViewReviewControl
{
    public List<Conference> filterConferenceList(Chair chair)
    {
        return chair.getConferenceList();
    }
    
    public List<Paper> getPaperList(Conference conference)
    {
        return conference.getPaperList();
    }
    
    public List<Review> getReviewList(Paper paper)
    {
        return paper.getReviewList();
    }
    
    public void setFinalDecision(Paper paper, String decision)
    {
        paper.setFinalDecision(decision);
    }
}
