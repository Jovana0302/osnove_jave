package d19_01_2023;

import java.util.ArrayList;

public class PlaninarskiDom {

    private String naziv;
    private int godinaOsnivanja;

    private ArrayList<Planinar> planinari;

    public PlaninarskiDom(){
        this.planinari = new ArrayList<>();
    }

    public PlaninarskiDom(String naziv, int godinaOsnivanja) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
        this.planinari = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public void uclaniPlaninara(Planinar planinar){
        this.planinari.add(planinar);
    }

    public int uspesni(Planina planina){
        int brojUspesnih = 0;
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).uspesanUspon(planina)){
                brojUspesnih++;
            }
        }
        return brojUspesnih;
    }

    public void izbaciPlaninara(String id){
        for (int i = 0; i < this.planinari.size(); i++) {
            if (this.planinari.get(i).getId().equals(id)){
                this.planinari.remove(i);
            }
        }
    }

    public void stampaj(){
        System.out.println("Planinarski dom: " + this.naziv);
        System.out.println("Godina osnivanja: " + this.godinaOsnivanja);
        System.out.println("Planinari: ");
        System.out.println();
        for (int i = 0; i < this.planinari.size(); i++) {
            this.planinari.get(i).stampaj();
            System.out.println();
        }
    }

    public int mesecniPrihod(){
        int mesecniPrihod = 0;
        for (int i = 0; i < this.planinari.size(); i++) {
            mesecniPrihod = mesecniPrihod + this.planinari.get(i).clanarina();
        }
        return mesecniPrihod;
    }

}
