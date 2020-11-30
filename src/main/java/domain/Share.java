package domain;

public class Share {
    private int postID;
    private int amountShare;
    private int userReposted;

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getAmountShare() {
        return amountShare;
    }

    public void setAmountShare(int amountShare) {
        this.amountShare = amountShare;
    }
}
