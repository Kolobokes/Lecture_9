package domain;

public class WriteComment {
    private int postID;
    private String authorURL;
    private String content;
    private AttachObject AttachObject;
    private AttachPhoto AttachPhoto;
    private AddSmile AddSmile;
    private boolean send;

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

    public domain.AttachObject getAttachObject() {
        return AttachObject;
    }

    public void setAttachObject(domain.AttachObject attachObject) {
        AttachObject = attachObject;
    }

    public domain.AttachPhoto getAttachPhoto() {
        return AttachPhoto;
    }

    public void setAttachPhoto(domain.AttachPhoto attachPhoto) {
        AttachPhoto = attachPhoto;
    }

    public domain.AddSmile getAddSmile() {
        return AddSmile;
    }

    public void setAddSmile(domain.AddSmile addSmile) {
        AddSmile = addSmile;
    }
}
