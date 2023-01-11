package d10_01_2023;

public class Proizvod {

    private String naziv;
    private double cenaIzrade;
    private Kupac musterija;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Kupac getMusterija() {
        return musterija;
    }

    public void setMusterija(Kupac musterija) {
        this.musterija = musterija;
    }

    public Proizvod(String naziv, double cenaIzrade, Kupac musterija) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
        this.musterija = musterija;
    }

    public double cena(){
        return this.cenaIzrade * 1.9 * (100 - this.musterija.getKartica().getPopust()) / 100;
    }

    public void stampajProizvod(){
        System.out.println(this.naziv + " - " + cena());
        this.musterija.stampaj();
    }
}
