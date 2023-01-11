package d10_01_2023;

public class Product {
    private String sifra;
    private String naziv;
    private double cenaKg;

    public Product(String sifra, String naziv, double cenaKg) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaKg = cenaKg;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaKg(double cenaKg) {
        this.cenaKg = cenaKg;
    }

    public double getCenaKg(){
        return this.cenaKg;
    }

    public double getCenaLb(){
        return this.cenaKg * 2.2046;
    }

    public void stampaj(){
        System.out.println("(" + this.sifra + ") - (" + this.naziv + ")");
    }
}
