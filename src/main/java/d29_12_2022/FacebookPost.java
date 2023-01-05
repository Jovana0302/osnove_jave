package d29_12_2022;

public class FacebookPost {
    private String poster;
    private String profile;
    private String post;
    private int likes;
    private int shares;

    public String getPoster(){
        return this.poster;
    }

    public String getProfile(){
        return this.profile;
    }

    public String getPost(){
        return this.post;
    }

    public int getLikes(){
        return this.likes;
    }

    public int getShares(){
        return this.shares;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setProfile(String profile){
        this.profile = profile;
    }

    public void setPost(String post){
        this.post = post;
    }

    public void like(){
        this.likes = this.likes + 1;
    }

    public void dislike(){
        this.likes = this.likes - 1;
        if (this.likes < 0) {
            this.likes = 0;
        }
    }

    public void share(){
        this.shares = this.shares + 1;
    }

    public void print(){
        System.out.println(this.poster + " >>> " + this.profile + "\n" +
                this.post + "\n" +
                "Likes " + this.likes + " | Shares " + this.shares + "\n");
    }
}
