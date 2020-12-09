package domain;

import java.util.Date;

public class Post {
    private int id;
    private int accountID;
    private int fromID;
    private int createdBy;
    private int replyOwnerID;
    private int replyPostId;
    private int postponedId;
    private int friendsOnly;
    private String copyright;
    private String postType;
    private String signerId;
    private String canPin;
    private String canDelete;
    private String canEdit;
    private String IsPinned;
    private String MarkedAsAdds;
    private Boolean IsFavourite;
    private Boolean donut;
    private Geo Geolocation;
    private PostSource PostSource;
    private String accountPhotoURL;
    private String accountName;
    private Date date;
    private PostActions PostActions;
    private String content;
    private Like LikesInfo;
    private int amountLike;
    private Comment CommentsInfo;
    private int amountComment;
    private boolean showInFull;
    private Views Views;
    private WriteComment WriteComment;

    public Boolean getDonut() {
        return donut;
    }

    public void setDonut(Boolean donut) {
        this.donut = donut;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getFromID() {
        return fromID;
    }

    public void setFromID(int fromID) {
        this.fromID = fromID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerID() {
        return replyOwnerID;
    }

    public void setReplyOwnerID(int replyOwnerID) {
        this.replyOwnerID = replyOwnerID;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getSignerId() {
        return signerId;
    }

    public void setSignerId(String signerId) {
        this.signerId = signerId;
    }

    public String getCanPin() {
        return canPin;
    }

    public void setCanPin(String canPin) {
        this.canPin = canPin;
    }

    public String getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(String canDelete) {
        this.canDelete = canDelete;
    }

    public String getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(String canEdit) {
        this.canEdit = canEdit;
    }

    public String getIsPinned() {
        return IsPinned;
    }

    public void setIsPinned(String isPinned) {
        IsPinned = isPinned;
    }

    public String getMarkedAsAdds() {
        return MarkedAsAdds;
    }

    public void setMarkedAsAdds(String markedAsAdds) {
        MarkedAsAdds = markedAsAdds;
    }

    public Boolean getFavourite() {
        return IsFavourite;
    }

    public void setFavourite(Boolean favourite) {
        IsFavourite = favourite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountPhotoURL() {
        return accountPhotoURL;
    }

    public void setAccountPhotoURL(String accountPhotoURL) {
        this.accountPhotoURL = accountPhotoURL;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAmountLike() {
        return amountLike;
    }

    public void setAmountLike(int amountLike) {
        this.amountLike = amountLike;
    }

    public int getAmountComment() {
        return amountComment;
    }

    public void setAmountComment(int amountComment) {
        this.amountComment = amountComment;
    }

    public boolean isShowInFull() {
        return showInFull;
    }

    public void setShowInFull(boolean showInFull) {
        this.showInFull = showInFull;
    }

    public Geo getGeolocation() {
        return Geolocation;
    }

    public void setGeolocation(Geo geolocation) {
        Geolocation = geolocation;
    }

    public domain.PostSource getPostSource() {
        return PostSource;
    }

    public void setPostSource(domain.PostSource postSource) {
        PostSource = postSource;
    }

    public domain.PostActions getPostActions() {
        return PostActions;
    }

    public void setPostActions(domain.PostActions postActions) {
        PostActions = postActions;
    }

    public Like getLikesInfo() {
        return LikesInfo;
    }

    public void setLikesInfo(Like likesInfo) {
        LikesInfo = likesInfo;
    }

    public Comment getCommentsInfo() {
        return CommentsInfo;
    }

    public void setCommentsInfo(Comment commentsInfo) {
        CommentsInfo = commentsInfo;
    }

    public domain.Views getViews() {
        return Views;
    }

    public void setViews(domain.Views views) {
        Views = views;
    }

    public domain.WriteComment getWriteComment() {
        return WriteComment;
    }

    public void setWriteComment(domain.WriteComment writeComment) {
        WriteComment = writeComment;
    }
}

