package d13_01_2023;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> kombinacije;

    public Listic(){
        this.kombinacije = new ArrayList<>();
    }

    public void dodajKombinaciju(Kombinacija k){
    this.kombinacije.add(k);
    }

    public boolean dobitna(Kombinacija dobitnaKombinacija){
        for (int i = 0; i < this.kombinacije.size(); i++) {
            if (this.kombinacije.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)){
                return true;
            }
        }
        return false;
    }

    public void stampajListic(){
        for (int i = 0; i < this.kombinacije.size(); i++) {
            this.kombinacije.get(i).stampaj();
        }
    }
}