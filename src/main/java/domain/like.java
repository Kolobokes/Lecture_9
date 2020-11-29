package domain;

public class like {
    private boolean putLike;
    private boolean takeAwayLike;
    private int count;
    private int userLikes;
    private int canLike;
    private int canPublish;


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
