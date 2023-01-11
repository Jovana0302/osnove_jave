package d10_01_2023;

public class Kupac {

    private String imeIPrezime;
    private ClanskaKarta kartica;

    public Kupac(String imeIPrezime, ClanskaKarta kartica) {
        this.imeIPrezime = imeIPrezime;
        this.kartica = kartica;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public ClanskaKarta getKartica() {
        return kartica;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime + " - " + this.kartica.getBrojKartice());
    }
}
