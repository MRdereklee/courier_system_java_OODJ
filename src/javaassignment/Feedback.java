package javaassignment;


public class Feedback {
    
    private String OrderID;
    private String Comment;
    private String Rating;
    
    public Feedback(String OrderID, String Comment, String Rating) {
        this.OrderID = OrderID;
        this.Comment = Comment;
        this.Rating = Rating;
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
