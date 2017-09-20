import java.util.*;
import java.lang.*;
/**
 * Write a description of class ViewReviewUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ViewReviewUI
{
    private ViewReviewControl viewReviewControl;
    public ViewReviewUI()
    {
        viewReviewControl = new ViewReviewControl();
    }
    
    public void viewReview()
    {
        String choice = "";
        User user = Session.getCurrentUser();
        Scanner input = new Scanner(System.in);
        while(!choice.equals("3"))
        {
            if(viewReviewControl.filterConferenceList(user).size()==0)
            {
                System.out.println("There is no conference yet.");
                return;
            }
            displayConferenceList(viewReviewControl.filterConferenceList(user));
            Conference conference = acceptConferenceChoice(viewReviewControl.filterConferenceList(user));
            if(viewReviewControl.getPaperList(conference).size()==0)
            {
                System.out.println("There is no paper yet.");
                return;
            }
            displayPaperList(viewReviewControl.getPaperList(conference));
            Paper paper = acceptPaperChoice(viewReviewControl.getPaperList(conference));
            paperChoice();
            choice = input.nextLine();
            switch(choice)
            {
                case "1":
                    if(viewReviewControl.getReviewList(paper).size()==0)
                    {
                        System.out.println("There is no review yet.");
                        return;
                    }
                    displayReviewList(viewReviewControl.getReviewList(paper));
                    System.out.println("Review title:" + acceptReviewChoice(viewReviewControl.getReviewList(paper)).getTitle());
                    break;
                case "2":viewReviewControl.setFinalDecision(paper, acceptFinalDecision());break;
                case "3":break;
                default:System.out.println("Please enter the correct number!");
            }
        }
    }
    
    private void displayConferenceList(List<Conference> conferenceList)
    {
        int num = 1;
        for(Conference conference:conferenceList)
        {
            System.out.println(num +"."+ conference.getTitle());
            num++;
        }
    }
    
    private Conference acceptConferenceChoice(List<Conference> conferenceList) throws NumberFormatException,IndexOutOfBoundsException
    {
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please choose the conference:");
        num = Integer.parseInt(input.nextLine());
        return conferenceList.get(num-1);      
    }
    
    private void displayPaperList(List<Paper> paperList)
    {
        int num = 1;
        for(Paper paper:paperList)
        {
            System.out.println(num+"."+paper.getTitle());
            num++;
        }
    }
    
    private Paper acceptPaperChoice(List<Paper> paperList) throws NumberFormatException,IndexOutOfBoundsException
    {
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please choose the paper:");
        num = Integer.parseInt(input.nextLine());
        return paperList.get(num-1); 
    }
    
    private void displayReviewList(List<Review> reviewList)
    {
        int num = 1;
        for(Review review:reviewList)
        {
            System.out.println(num+"."+review.getTitle());
            num++;
        }
    }
    
    private Review acceptReviewChoice(List<Review> reviewList) throws NumberFormatException,IndexOutOfBoundsException
    {
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please choose the review:");
        num = Integer.parseInt(input.nextLine());
        return reviewList.get(num-1); 
    }
    
    private String acceptFinalDecision()
    {
        String decision = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your final decision:");
        decision = input.nextLine();
        return decision;
    }
    
    private void paperChoice()
    {
        System.out.println("1.View reviews");
        System.out.println("2.Make final decision");
        System.out.println("3.Cancel");
        System.out.print("Please choose the option:");
    }
}
