package d10_01_2023;

public class Vaga {

    private String mernaJedinica;

    private Product p;

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public double sracunajCenu(double tezina) {
        if (this.mernaJedinica.equals("kg")) {
            return tezina * this.p.getCenaKg();
        } else if (this.mernaJedinica.equals("lb")) {
            return tezina * this.p.getCenaLb();
        } else {
            return 0;
        }
    }

    public void stampajRacun(double tezina){
        this.p.stampaj();
        if (this.mernaJedinica.equals("kg")) {
            System.out.println("(" + this.p.getCenaKg() + ") (" + this.mernaJedinica + ") x (" + tezina + ")");
        } else if (this.mernaJedinica.equals("lb")) {
            System.out.println("(" + this.p.getCenaLb() + ") (" + this.mernaJedinica + ") x (" + tezina + ")");
        }
        System.out.println("Ukupno: " + sracunajCenu(tezina));
    }
}
