package domain;

public class WriteComment {
    private int postID;
    private String authorURL;
    private String content;
    private String attachObject;
    private String attachPhoto;
    private String addSmile;
    private boolean send;

    public String getAttachObject() {
        return attachObject;
    }

    public void setAttachObject(String attachObject) {
        this.attachObject = attachObject;
    }

    public String getAttachPhoto() {
        return attachPhoto;
    }

    public void setAttachPhoto(String attachPhoto) {
        this.attachPhoto = attachPhoto;
    }

    public String getAddSmile() {
        return addSmile;
    }

    public void setAddSmile(String addSmile) {
        this.addSmile = addSmile;
    }

    public boolean isSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

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
