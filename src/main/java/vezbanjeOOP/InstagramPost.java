package vezbanjeOOP;

import java.util.ArrayList;

public class InstagramPost {

    private ArrayList<InstagramImage> slike;
    private String opis;

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public InstagramPost(){
        this.slike = new ArrayList<>();
    }

    public void dodajSliku(InstagramImage slika){
        this.slike.add(slika);
    }

    public void stampajPost(){
        System.out.println(this.opis);
        for (int i = 0; i < this.slike.size(); i++) {
            System.out.println(this.slike.get(i).getLink());
                this.slike.get(i).stampajTagove();
        }
    }

}
