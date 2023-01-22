package d19_01_2023;

public class StaklenaAmbalaza extends Ambalaza {

    private double kaucija;

    private boolean potrebnaKaucija;

    private double osnovnaCena;

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPotrebnaKaucija() {
        return potrebnaKaucija;
    }

    public void setPotrebnaKaucija(boolean potrebnaKaucija) {
        this.potrebnaKaucija = potrebnaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(){
        super();
    }

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija, boolean potrebnaKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.potrebnaKaucija = potrebnaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        if (this.isPotrebnaKaucija()){
            return this.osnovnaCena * 1.2 * this.kaucija;
        } else {
            return this.osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Artikal: " + this.nazivArtikla);
        System.out.println("Neto tezina: " + this.netoTezina + " g");
        System.out.println("Bruto tezina: " + this.brutoTezina + " g");
        if(isPotrebnaKaucija()){
            System.out.println("Placa se kaucija za flasu");
        }
        System.out.println("Cena: " + this.cena() + " din.");
        System.out.println();
    }
}
