package domain;

import java.util.Date;

public class Comment {
    private int postID;
    private int id;
    private String author;
    private String content;
    private Date date;
    private String commentActions;
    private String commentAnswer;
    private String share;

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCommentActions() {
        return commentActions;
    }

    public void setCommentActions(String commentActions) {
        this.commentActions = commentActions;
    }

    public String getCommentAnswer() {
        return commentAnswer;
    }

    public void setCommentAnswer(String commentAnswer) {
        this.commentAnswer = commentAnswer;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }
}
