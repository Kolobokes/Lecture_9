package domain;

import java.util.Date;

public class post {
    private int id;
    private int accountID;
    private String accountPhotoURL;
    private String accountName;
    private Date date;
    class postActions{};
    private String content;
    class like{};
    private int amountLike;
    class comment{};
    private int amountComment;
    private boolean showInFull;
    class views{};
    class writeComment{};

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

}

