package d12_01_2023;

public class Racun {

    private String brRacuna;
    private String imeIPrezime;
    private int stanje;

    public String getBrRacuna(){
        return this.brRacuna;
    }

    public String getImeIPrezime(){
        return this.imeIPrezime;
    }

    public int getStanje(){
        return this.stanje;
    }

    public void setBrRacuna(String brRacuna){
        this.brRacuna = brRacuna;
    }

    public void setImeIPrezime(String imeIPrezime){
        this.imeIPrezime = imeIPrezime;
    }

    public Racun(String brRacuna, String imeIPrezime, int stanje) {
        this.brRacuna = brRacuna;
        this.imeIPrezime = imeIPrezime;
        this.stanje = stanje;
    }

    public void promeniStanje(int vrednost){
        this.stanje = this.stanje - vrednost;
        if (this.stanje < 0){
            this.stanje = 0;
        }
    }

    public void stampajRacun(){
        System.out.println(this.imeIPrezime + " - " + this.brRacuna);
        System.out.println("stanje na racunu je " + this.stanje + " rsd" + "\n");
    }
}
