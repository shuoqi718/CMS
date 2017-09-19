
/**
 * Write a description of class Session here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Session
{
    private static Chair currentChair;
    private static Author currentAuthor;
    private static Reviewer currentReviewer;
    
    public static Chair getCurrentChair()
    {
        return currentChair;
    }
    
    public static Author getCurrentAuthor()
    {
        return currentAuthor;
    }
    
    public static Reviewer getCurrentReviewer()
    {
        return currentReviewer;
    }
    
    public static void setCurrentChair(Chair chair)
    {
        currentChair = chair;
    }
    
    public static void setCurrentAuthor(Author author)
    {
        currentAuthor = author;
    }
    
    public static void setCurrentReviewer(Reviewer reviewer)
    {
        currentReviewer = reviewer;
    }
}
