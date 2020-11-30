package domain;

public class Like {
    private boolean putLike;
    private boolean takeAwayLike;
    private int count;
    private int userLikes;
    private int canLike;
    private int canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }

    public boolean isPutLike() {
        return putLike;
    }

    public void setPutLike(boolean putLike) {
        this.putLike = putLike;
    }

    public boolean isTakeAwayLike() {
        return takeAwayLike;
    }

    public void setTakeAwayLike(boolean takeAwayLike) {
        this.takeAwayLike = takeAwayLike;
    }
}
