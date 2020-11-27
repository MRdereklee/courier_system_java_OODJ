package javaassignment;


public class Feedback {
    
    private String FeedbackID;
    private String OrderID;
    private String Comment;
    private String Rating;
    
    public Feedback(String FeedbackID, String OrderID, String Comment, String Rating) {
        this.FeedbackID =FeedbackID;
        this.OrderID = OrderID;
        this.Comment = Comment;
        this.Rating = Rating;
    }
    
    public String getFeedbackID() {
        return FeedbackID;
    }

    public void setFeedbackID(String FeedbackID) {
        this.FeedbackID = FeedbackID;
    }
    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }
}
