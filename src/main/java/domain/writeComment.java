package domain;

public class writeComment {
    private int postID;
    private String authorURL;
    private String content;
    class attachObject{};
    class attachPhoto{};
    class addSmile{};
    class send{};

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getAuthorURL() {
        return authorURL;
    }

    public void setAuthorURL(String authorURL) {
        this.authorURL = authorURL;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
