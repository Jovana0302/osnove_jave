package d12_01_2023;

public class Transakcija {

    private String id;
    private Racun salje;
    private Racun prima;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Racun getSalje() {
        return salje;
    }

    public void setSalje(Racun salje) {
        this.salje = salje;
    }

    public Racun getPrima() {
        return prima;
    }

    public void setPrima(Racun prima) {
        this.prima = prima;
    }

    public Transakcija(String id, Racun salje, Racun prima){
        this.id = id;
        this.salje = salje;
        this.prima = prima;
    }

    private int provizija(int suma){
        if (suma > 4500) {
            return suma / 100;
        }
        return 45;
    }

    public void izvrsiTransakciju(int suma) {
        if (this.salje.getStanje() >= suma) {
            this.salje.promeniStanje(suma + provizija(suma));
            this.prima.promeniStanje(-suma);
        } else {
            System.out.println("Na racunu nema dovoljno sredstava za transakciju");
        }
    }

    public void stampajTransakciju(){
        System.out.println(this.id);
        System.out.println("Racun sa: " + this.salje.getImeIPrezime() + " - " + this.salje.getBrRacuna());
        System.out.println("Racun na: " + this.prima.getImeIPrezime() + " - " + this.prima.getBrRacuna() + "\n");
    }

}
