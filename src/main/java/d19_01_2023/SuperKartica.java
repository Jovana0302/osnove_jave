package d19_01_2023;

public class SuperKartica {

    private int brojKartice;

    private String vlasnik;

    private int popust;

    public SuperKartica(){}

    public SuperKartica(int brojKartice, String vlasnik, int popust) {
        this.brojKartice = brojKartice;
        this.vlasnik = vlasnik;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void stampaj(){
        System.out.println(this.brojKartice + ", " + this.vlasnik);
    }

}
