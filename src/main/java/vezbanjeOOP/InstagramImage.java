package vezbanjeOOP;

import java.util.ArrayList;

public class InstagramImage {
    private ArrayList<InstagramTag> tagovi;

    private ArrayList<Integer> dimenzijaSlike;

    private String link;

    public String getLink() {
        return link;
    }

    public InstagramImage(int x1, int x2, int y1, int y2, String link) {
        this.dimenzijaSlike = new ArrayList<>();
        this.dimenzijaSlike.add(x1);
        this.dimenzijaSlike.add(x2);
        this.dimenzijaSlike.add(y1);
        this.dimenzijaSlike.add(y2);
        this.link = link;
        this.tagovi = new ArrayList<>();
    }

    public void dodajTag(InstagramTag tag) {
        this.tagovi.add(tag);
    }

    public boolean jeTagovan() {
        for (int i = 0; i < this.tagovi.size(); i++) {
            if (this.tagovi.get(i).getX() >= this.dimenzijaSlike.get(0)
              && this.tagovi.get(i).getX() <= this.dimenzijaSlike.get(1)
              && this.tagovi.get(i).getY() >= this.dimenzijaSlike.get(2)
              && this.tagovi.get(i).getY() <= this.dimenzijaSlike.get(3)){
                return true;
            }
        }
        return false;
    }

    public void stampajTagove(){
        for (int i = 0; i < this.tagovi.size(); i++) {
            if (jeTagovan()){
                this.tagovi.get(i).stampajTag();
            }
        }
    }

}
