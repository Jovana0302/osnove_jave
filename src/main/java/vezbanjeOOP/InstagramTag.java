package vezbanjeOOP;

public class InstagramTag {
    private int x;
    private int y;
    private InstagramUser tagovan;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public InstagramUser getTagovan() {
        return tagovan;
    }

    public void setTagovan(InstagramUser tagovan) {
        this.tagovan = tagovan;
    }

    public InstagramTag(int x, int y, InstagramUser tagovan) {
        this.x = x;
        this.y = y;
        this.tagovan = tagovan;
    }

    public void stampajTag(){
        System.out.println("Tag: " + this.tagovan.getImeIPrezime());
    }
}
