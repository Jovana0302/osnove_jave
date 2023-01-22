package d19_01_2023;

public class Tetrapak extends Ambalaza {

    private boolean zaReciklazu;

    private double osnovnaCena;

    public boolean isZaReciklazu() {
        return zaReciklazu;
    }

    public void setZaReciklazu(boolean zaReciklazu) {
        this.zaReciklazu = zaReciklazu;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(){
        super();
    }

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean zaReciklazu, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.zaReciklazu = zaReciklazu;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        if (isZaReciklazu()){
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Artikal: " + this.nazivArtikla);
        System.out.println("Neto tezina: " + this.netoTezina + " g");
        System.out.println("Bruto tezina: " + this.brutoTezina + " g");
        if(isZaReciklazu()){
            System.out.println("Od recikliranog materijala");
        }
        System.out.println("Cena: " + this.cena() + " din.");
        System.out.println();
    }
}
