import java.util.*;
/**
 * Write a description of class ViewReviewControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ViewReviewControl
{
    public List<Conference> filterConferenceList(User user)
    {
        List<Conference> filteredConference = new ArrayList<>();
        for(Conference conference : DataTable.getConferenceList())
        {
            if(conference.getUser().equals(user))
                filteredConference.add(conference);
        }
        return filteredConference;
    }
    
    public List<Paper> getPaperList(Conference conference)
    {
        List<Paper> filteredPaper = new ArrayList<>();
        for( Paper paper : DataTable.getPaperList())
        {
            if(paper.getConference().equals(conference))
                filteredPaper.add(paper);
        }
        return filteredPaper;
    }
    
    public List<Review> getReviewList(Paper paper)
    {
        List<Review> filteredReview = new ArrayList<>();
        for( Review review : DataTable.getReviewList())
        {
            if(review.getPaper().equals(paper))
                filteredReview.add(review);
        }
        return filteredReview;
    }
    
    public void setFinalDecision(Paper paper, String decision)
    {
        paper.setFinalDecision(decision);
    }
}
