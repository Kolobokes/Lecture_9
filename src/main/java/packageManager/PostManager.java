package packageManager;

public class PostManager {
    private int[] post;

    public int[] getPost() {
        return post;
    }

    public void setPost(int[] post) {
        this.post = post;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    private String search;
    private String delete;

}
