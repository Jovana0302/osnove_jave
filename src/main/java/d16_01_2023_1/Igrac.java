package d16_01_2023_1;

import java.util.ArrayList;

public class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private ArrayList<Karton> kartoni;
    private boolean jeKapiten;

    public Igrac(){
        super();
        this.kartoni = new ArrayList<>();
    }

    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean jeKapiten){
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;
        this.kartoni = new ArrayList<>();
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJeKapiten() {
        return jeKapiten;
    }

    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }

    public void dodajKarton(String tipKartona){
        Karton k = new Karton(tipKartona);
        this.kartoni.add(k);
    }

    public int brojZutih(){
        int brojac = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTipKartona().equals("zuti")){
                brojac++;
            }
        }
        return brojac;
    }

    public int brojCrvenih(){
        int brojac = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTipKartona().equals("crveni")){
                brojac++;
            }
        }
        return brojac;
    }

    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj: " + this.broj);
        System.out.println("Pozicija: " + this.pozicija);
        if (this.jeKapiten) {
            System.out.println("Kapiten");
        } else {
            System.out.println("Nije kapiten");
        }
        System.out.println("Broj zutih kartona: " + this.brojZutih());
        System.out.println("Broj crvenih kartona: " + this.brojCrvenih());
    }
}
