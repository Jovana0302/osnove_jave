package d19_01_2023;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> ambalaze;

    public Korpa(){
        this.ambalaze = new ArrayList<>();
    }

    public void dodajAmbalazu(Ambalaza a){
        this.ambalaze.add(a);
    }

    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (this.ambalaze.get(i).barkod.equals(barkod)){
                this.ambalaze.remove(i);
            }
        }
    }

    private double cenaSaPopustom(int popust){
        double cenaSaPopustom = 0;
        for (int i = 0; i < this.ambalaze.size(); i++) {
            cenaSaPopustom = cenaSaPopustom + (this.ambalaze.get(i).cena() - popust);
        }
        return cenaSaPopustom;
    }

    public double cenaKorpe(SuperKartica s){
        return this.cenaSaPopustom(s.getPopust());
    }

    public void stampaj(){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            this.ambalaze.get(i).stampaj();
        }
    }

}
